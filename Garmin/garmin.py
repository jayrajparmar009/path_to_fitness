import json
import pandas as pd
import os
from datetime import date, timedelta, datetime
os.chdir('/Users/jayrajparmar/Documents/side_project/health_data_tracking')
import basic_methods as bm
import time


def df_read():
    f = open('/Users/jayrajparmar/Documents/side_project/health_data_tracking/Garmin/jayrajparmar009@gmail.com_0_summarizedActivities.json', "r")
    data = json.loads(f.read())
    json_data = data[0]['summarizedActivitiesExport']
    lis = []
    for i in range(len(json_data)):
        df = pd.DataFrame([json_data[i]], columns = json_data[i].keys())
        lis.append(df)
    df_garmin_exec = pd.concat(lis)
    return df_garmin_exec



def duration_measure(col):
#     mili_sec = int(col)
    sec = int((col/1000))
    minutes = int((sec)/60)
    return minutes


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


def final_df_manipulation(df_garmin_exec):
    df_garmin_imp_cols = df_garmin_exec[['activityId','name','activityType','startTimeLocal','duration',
                                           'avgHr','maxHr','calories','bmrCalories','waterEstimated']]
    df_garmin_imp_cols['datetime'] = pd.to_datetime(df_garmin_imp_cols['startTimeLocal'].map(lambda x: time.strftime(
                                                            '%Y-%m-%d %H:%M:%S', time.localtime(x/1000))))
    df_garmin_imp_cols['date'] = df_garmin_imp_cols['datetime'].dt.date
    df_garmin_imp_cols['duration'] = df_garmin_imp_cols['duration'].astype(int)
    df_garmin_imp_cols['duration_minutes'] = df_garmin_imp_cols['duration'].map(lambda x: duration_measure(x))
    df_garmin_imp_cols.columns = ['activityId', 'name', 'activityType', 'startTimeLocal', 'duration',
                   'avgHr', 'maxHr', 'calories', 'bmrCalories', 'waterEstimated','datetime', 'date', 'duration_minutes']
    df_garmin_imp_cols = df_garmin_imp_cols[['datetime','date','duration_minutes', 'activityType','avgHr','maxHr',
                                         'bmrCalories','calories','waterEstimated']]

    df_garmin_imp_cols['date'] = pd.to_datetime(df_garmin_imp_cols['date'], errors='coerce')
    date_range = date_range_generator((date(2019,1,1)),(datetime.today().date()))
    final_df = date_range.merge(df_garmin_imp_cols, how='left', left_on='date_range', right_on='date')
    return final_df


def final_df_prep():
    df = df_read()
    final_df = final_df_manipulation(df)
    return final_df
    










