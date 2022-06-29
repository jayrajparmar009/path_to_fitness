import pandas as pd
import numpy as np
import os
import s3fs
import plotly.express as px
import plotly.graph_objects as go
import streamlit as st

# Reading data file directly from Amazon AWS S3
final_df = pd.read_csv("s3://healthmarkers/final_df.csv",
                   storage_options={"anon": False})


# Filtering file for desired date range
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


# Metrics df
metrics = df.tail(14)


# Title
st.title("Healthmarker Tracker")



st.markdown("<i> All the KPIs are calculated and compared against last week's average values", unsafe_allow_html=True)
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
# components.html("""<hr style="height:10px;border:none;color:#333;background-color:#333;"/> """)
st.markdown("""<hr style="height:10px;border:none;color:#333;background-color:#333;" /> """, unsafe_allow_html=True)            
st.subheader("Trend on Health Markers")
st.plotly_chart(fig
#                 , use_container_width=True
               )








