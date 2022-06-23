# Packages and dependencies
import pandas as pd
import numpy as np
import os
# print(os.getcwd())
# # print(pip list)
# os.chdir('..')
# print(os.getcwd())

# from pip import _internal
# _internal.main(['list'])
# print(pip list)
# from Garmin import garmin as gm
# from myfitnesspal import myfitness_pal as mf
# from Weight_data import weight_data as wd
# from Samsung_health import samsung as sm


import plotly.express as px
import plotly.graph_objects as go


import streamlit as st


# Data building

# garmin_df = gm.final_df_prep()
# mfp_exec = mf.final_df_prep(typ='ex')
# mfp_nut = mf.final_df_prep(typ='nut')
# weight_df = wd.final_df_prep()
# steps_df = sm.final_df_prep()

# steps_df['date_range'] = pd.to_datetime(steps_df['date_range'], errors='coerce')

# final_df = weight_df.merge(garmin_df, how='left', on='date_range').merge(steps_df, 
#                 how='left', on='date_range').merge(mfp_nut, how='left', on='date_range')


# reading dataframe


final_df = pd.read_csv('/Users/jayrajparmar/Documents/side_project/health_data_tracking/final_df.csv')

# # Plotly Charts

# st.title("Health Marker tracker")


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




# Creating a metrics dataframe to have metrics cards for weekly difference in averages
metrics = df.tail(14)


fig1 = go.Figure()


fig1.add_trace(go.Indicator(
    value = metrics['count'].tail(7).mean(),
    delta = {'reference': 6000},
    gauge = {
        'axis': {'visible': True}},
    domain = {'row': 0, 'column': 0}))


fig1.update_layout(
    grid = {'rows': 1, 'columns': 1, 'pattern': "independent"},
    template = {'data' : {'indicator': [{
        'title': {'text': "Weekly Average Steps"},
        'mode' : "number+delta+gauge",
        'delta' : {'reference': 90}}]
                         }})



# Title
st.title("Healthmarker Tracker")




col1, col2, col3, col4 = st.columns(4)

col1.metric(label="Steps", 
            value=int(metrics.tail(7)['count'].mean()), 
            delta=int(metrics.tail(7)['count'].mean() - metrics.head(7)['count'].mean()))

col2.metric(label="Body Fat%",
            value=round(metrics.tail(7)['Body_Fat%'].mean(),2),
            delta=round(metrics.tail(7)['Body_Fat%'].mean() - metrics.head(7)['Body_Fat%'].mean(), 2))
            
            
col3.metric(label="Weight (Kg)",
            value=round(metrics.tail(7)['Weightkg'].mean(),2), 
            delta=round(metrics.tail(7)['Weightkg'].mean() - metrics.head(7)['Weightkg'].mean(),2))

col4.metric(label="BMR (KCAL)",
            value=round(metrics.tail(7)['BMRkcal'].mean(),2), 
            delta=round(metrics.tail(7)['BMRkcal'].mean() - metrics.head(7)['BMRkcal'].mean(),2))


st.subheader("Metrics card testing features")
st.plotly_chart(fig1)
st.subheader("Trend on Weight data")
st.plotly_chart(fig)











