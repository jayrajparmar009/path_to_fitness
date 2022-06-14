import pandas as pd
import numpy as np
import os
import requests
import datetime
from datetime import date, timedelta, datetime

os.chdir('/Users/jayrajparmar/Documents/side_project/health_data_tracking')

import basic_methods as bm


import matplotlib.pyplot as plt



def data_read(path):
    return pd.read_csv('/Users/jayrajparmar/Documents/side_project/health_data_tracking/Weight_data/Measurement Data.csv')


# print(df_initial.dtypes)

# Function to clean column names, convert date to datetime and delete Remarks field
def data_prep(df,date_col):
#     # Column name cleaning
    d = {' ':'_',
         '(':'',
         ')':''}
    df.columns = [i.replace(' ','_').replace('(','').replace(')','') for i in list(df)]
    print(df.columns)
    df = bm.datetime_conversion(df, [date_col])
    del df['Remarks']
    return df
    
# Creating a function to convert features to numeric and extracting just date from datetime
def date_numeric_groupby(df,date_col):
    
    """First part is for converting datatypes to appropriate type for aggregation without error
       Second part is for removing multiple entries for same dates"""
    try:
        lis=[]
        for i in df.columns:
            
            if df[i].dtypes == 'datetime64[ns]':
                lis.append(df[i].dt.date)
                print(str(i)+str('(')+str(df[i].dtypes)+str(')')+str(':')+'Done')
            elif df[i].dtypes == str:
                lis.append(df[i].astype(str))
                print(str(i)+str('(')+str(df[i].dtypes)+str(')')+str(':')+'Done')
            else: 
                lis.append(df[i].apply(pd.to_numeric, errors='coerce'))
                print(str(i)+str('(')+str(df[i].dtypes)+str(')')+str(': ')+'Done')
    except:
        print("There is an unknown datatype in the data!!")
    df_temp = pd.concat(lis, axis=1)
    print('************************************************************************************')
    print('************************************************************************************')
    print('*****************************Datatypes after conversion*****************************')
    print('************************************************************************************')
    print('************************************************************************************')

    print(df_temp.dtypes)
    
    # Creating list of numerical columns
    numerics = ['int16', 'int32', 'int64', 'float16', 'float32', 'float64']
    col_lis = list(df_temp.select_dtypes(include=numerics).columns)

    # Creating a list of np.max functions for creating dictionary
    max_func = [np.max for i in range(len(col_lis))]

    # Creating dictionary from both lists
    d = dict(zip(col_lis, max_func))

    df_max_cols = df_temp.groupby([date_col]).agg(d).reset_index()

    print('Shape of dataframe before removing duplicates: ' + str(df_temp.shape))

    print('Shape of dataframe after removing duplicates: ' + str(df_max_cols.shape))
    return df_max_cols


    
def null_imputation_rolling(df,date_col):
    df = bm.datetime_conversion(df, [date_col])
    df = df.sort_values(date_col)
    # Now we would fill the null values using .interpolate with linear method; it would be somewhat like imputing
    # mean values from previous and next value in columns
    df = df.set_index(date_col)
    df.interpolate(method='linear', limit_direction='forward', axis=0, inplace=True)
    for i in df.columns:
        if i != date_col:
            df[i+str('_rolling_7')] = df[i].rolling(window=7).mean()
    return df

def date_range_generator(start_dt, end_dt):
    """
    Function for generating date range between start and end date;
    It has 2 arguments to be added:
        * start_dt = datetime value for the start date
        * end_dt = datetime value for the end date
    """
    lis = []
    while start_dt < end_dt:
        start_dt += timedelta(days=1)
        lis.append(start_dt)
    df = pd.DataFrame(lis, columns=['date_range'])
    df['date_range'] = pd.to_datetime(df['date_range'], errors='coerce')
    return df








def final_df_prep():
    df_initial = data_read('/Users/jayrajparmar/Documents/side_project/health_data_tracking/Weight_data/Measurement Data.csv')
    df_test = data_prep(df_initial, 'Time_of_Measurement')
    df_int = date_numeric_groupby(df_test,'Time_of_Measurement')
    df_final_pre = null_imputation_rolling(df_int,'Time_of_Measurement')
    total_dates = date_range_generator(date(2019,1,1), datetime.today().date())
    df_final = total_dates.merge(df_final_pre, how='left', left_on='date_range', right_on=df_final_pre.index)
    return df_final




# df_initial = pd.read_csv('/Users/jayrajparmar/Documents/side_project/health_data_tracking/Weight_data/Measurement Data.csv')       df_test = data_prep(df_initial, 'Time_of_Measurement')
# df_int = date_numeric_groupby(df_test,'Time_of_Measurement')
# df_final = null_imputation_rolling(df_int,'Time_of_Measurement')






