import pandas as pd
import numpy as np
import os
#os.chdir('..')
# from Garmin import garmin as gm
# from myfitnesspal import myfitness_pal as mf
# from Weight_data import weight_data as wd
# from Samsung_health import samsung as sm
import s3fs


import plotly.express as px
import plotly.graph_objects as go


import streamlit as st



# garmin_df = gm.final_df_prep()
# mfp_exec = mf.final_df_prep(typ='ex')
# mfp_nut = mf.final_df_prep(typ='nut')
# weight_df = wd.final_df_prep()
# steps_df = sm.final_df_prep()

# steps_df['date_range'] = pd.to_datetime(steps_df['date_range'], errors='coerce')

# final_df = weight_df.merge(garmin_df, how='left', on='date_range').merge(steps_df, 
#                 how='left', on='date_range').merge(mfp_nut, how='left', on='date_range')


# Create connection object.
# `anon=False` means not anonymous, i.e. it uses access keys to pull data.
# fs = s3fs.S3FileSystem(anon=False)

final_df = pd.read_csv("s3://healthmarkers/final_df.csv",
                   storage_options={"anon": False})

# Retrieve file contents.
# Uses st.experimental_memo to only rerun when the query changes or after 10 min.
# @st.experimental_memo(ttl=600)
# def read_file(filename):
#     with fs.open(filename) as f:
#         return f.read().decode("utf-8")

# content = read_file("healthmarkers/final_df.csv")

# # Print results.
# for line in content.strip().split("\n"):
#     name, pet = line.split(",")
#     st.write(f"{name} has a :{pet}:")


# st.dataframe(content)


df = final_df[(~final_df.Weightkg.isnull()) & (final_df.date_range > '2021-08-01')]



fig = go.Figure()
# Create and style traces
fig.add_trace(go.Scatter(x=df['date_range'], 
                         y=df['Weightkg'], name='Weight Trend',
                         line=dict(color='green', width=2)))

fig.add_trace(go.Scatter(x=df['date_range'], 
                         y=df['Weightkg_rolling_7'], 
                         name='7 day Rolling Weight Average',
                         line=dict(color='royalblue', width=2)))

fig.update_layout(
    width=1000,
    height=500,
    autosize=False,
    margin=dict(t=0, b=0, l=0, r=0),
    template="plotly_dark"
)

  
    
fig.update_layout(
    xaxis=dict(
        rangeselector=dict(
            buttons=list([
                dict(count=7,
                     label="1w",
                     step="day",
                     stepmode="backward",
                    visible=True),
                dict(count=14,
                     label="2w",
                     step="day",
                     stepmode="backward",
                    visible=True),
                dict(count=1,
                     label="1m",
                     step="month",
                     stepmode="backward",
                    visible=True),
                dict(count=6,
                     label="6m",
                     step="month",
                     stepmode="backward",
                    visible=True),
                dict(count=1,
                     label="YTD",
                     step="year",
                     stepmode="todate",
                    visible=True),
                dict(count=1,
                     label="1y",
                     step="year",
                     stepmode="backward",
                    visible=True),
                dict(step="all")
            ])
 
        ),
        rangeslider=dict(
            visible=True,
            bgcolor= 'darkred'
        ),
        
        type="date"
    ),
template="plotly_dark",
xaxis_rangeselector_font_color='black',
xaxis_rangeselector_activecolor='red',
xaxis_rangeselector_bgcolor='green',
)
fig.update_xaxes(showline=False, showgrid=False, linewidth=2, linecolor='black', gridcolor='black')
fig.update_yaxes(showline=False, showgrid=False, linewidth=2, linecolor='black', gridcolor='black')



st.plotly_chart(fig)









