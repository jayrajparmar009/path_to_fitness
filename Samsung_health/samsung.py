import numpy as np 
import pandas as pd 
import os
from glob import glob
import json
from datetime import date, timedelta, datetime



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
    return df

def data_read():
    path = '/Users/jayrajparmar/Documents/side_project/health_data_tracking/Samsung_health/samsunghealth_jayrajparmar009_202206082229'
    samsung_dir = os.path.join(path)
    os.chdir(path)
    read_df = lambda x: pd.read_csv(x, skiprows=1, index_col=False)
    dfs_steps = {i.replace('com.samsung.', ''): read_df(i) for i in os.listdir() if 'step' in i}
    steps_df = list(dfs_steps.values())[0]
    steps_refined = steps_df[['create_time','count','distance','calorie']]
    return steps_refined

def data_prep(steps_refined):
    steps_refined['create_time'] = pd.to_datetime(steps_refined['create_time'], errors='coerce')
    d_agg = {'count': np.mean,
             'distance': np.mean,
             'calorie': np.mean}
    steps_refined_final = steps_refined.groupby(steps_refined['create_time'].dt.date).agg(d_agg).reset_index()
    steps_refined_final['distance'] = steps_refined_final['distance']/1000
    steps_refined_final = steps_refined_final.sort_values('create_time')
    return steps_refined_final


def final_df_prep():
    df = data_read()
    df1 = data_prep(df)
    date_range = date_range_generator((date(2019,1,1)),(datetime.today().date()))
    final_df = date_range.merge(df1, how='left', left_on='date_range', right_on='create_time')
    return final_df


