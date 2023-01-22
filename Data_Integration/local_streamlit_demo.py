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

import streamlit.components.v1 as components

import plotly.express as px
import plotly.graph_objects as go
import hydralit_components as hc

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

st.set_page_config(page_title='Personal Health Marker Report',  layout='wide', page_icon='🏋️‍♂️')
final_df = pd.read_csv('/Users/jayrajparmar/Documents/side_project/health_data_tracking/final_df.csv')

# # Plotly Charts

# st.title("Health Marker tracker")


df = final_df[(~final_df.Weightkg.isnull()) & (final_df.date_range > '2021-08-01')]


# df = df.set_index('date_range')
df_linechart = df[['date_range',
                   'Weightkg','Weightkg_rolling_7',
                   'BMI','BMI_rolling_7',
                   'Body_Fat%','Body_Fat%_rolling_7',
                   'Fat-free_Body_Weightkg','Fat-free_Body_Weightkg_rolling_7',
                   'Subcutaneous_Fat%','Subcutaneous_Fat%_rolling_7',
                   'Visceral_Fat','Visceral_Fat_rolling_7', 
                   'Body_Water%','Body_Water%_rolling_7',
                   'Skeletal_Muscle%','Skeletal_Muscle%_rolling_7',
                   'Muscle_Masskg','Muscle_Masskg_rolling_7',
                   'Bone_Masskg','Bone_Masskg_rolling_7',
                   'Protein%','Protein%_rolling_7',
                   'BMRkcal','BMRkcal_rolling_7',
                   'Metabolic_Age','Metabolic_Age_rolling_7']]


maps = {
        'Weightkg': ['Weightkg','Weightkg_rolling_7'],
        'BMI':['BMI','BMI_rolling_7'],
        'BodyFat': ['Body_Fat%','Body_Fat%_rolling_7'],
        'FatFree_BodyWeight':['Fat-free_Body_Weightkg','Fat-free_Body_Weightkg_rolling_7'],
        'Subcutaneous_Fat%':['Subcutaneous_Fat%','Subcutaneous_Fat%_rolling_7'],
        'VisceralFat':['Visceral_Fat','Visceral_Fat_rolling_7'],
        'BodyWater%':['Body_Water%','Body_Water%_rolling_7'],
        'SkeletalMuscle%':['Skeletal_Muscle%','Skeletal_Muscle%_rolling_7'],
        'MuscleMassKg':['Muscle_Masskg','Muscle_Masskg_rolling_7'],
        'BoneMassKg':['Bone_Masskg','Bone_Masskg_rolling_7'],
        'Protien%':['Protein%','Protein%_rolling_7'],
        'BMRKcal':['BMRkcal','BMRkcal_rolling_7'],
        'Metabolic_Age':['Metabolic_Age','Metabolic_Age_rolling_7']
       
       }


# plotly figure
fig = px.line(df_linechart, x=df_linechart.date_range, y = df_linechart.columns[1:], markers=True,
              facet_row_spacing=0.5, facet_col_spacing=0.5) 

# groups and trace visibilities
group = []
vis = []
visList = []
for m in maps.keys():
    for col in df_linechart.columns[1:]:
        if col in maps[m]:
            vis.append(True)
        else:
            vis.append(False)
    group.append(m)
    visList.append(vis)
    vis = []
    
    

# buttons for each group
buttons = []
for i, g in enumerate(group):
    button =  dict(label=g,
                   method = 'restyle',
                    args = ['visible',visList[i]])
    buttons.append(button)

buttons = [{'label': 'all',
                 'method': 'restyle',
                 'args': ['visible', [True, True, True, True, True, True]]}] + buttons



# update layout with buttons                       
fig.update_layout(
    updatemenus=[
        dict(
        type="dropdown",
        direction="down",
        buttons = buttons,
        bgcolor='white',
        font={'color':'black'},
        borderwidth=2,
        bordercolor='Grey')
    ],
    xaxis_title="Dates",
    yaxis_title="Units",
)

fig.update_layout(
    width=1400,
    height=650,
    autosize=True,
    margin=dict(t=0, b=0, l=10, r=20),
    template="plotly_dark"
    
)

  
    
fig.update_layout(
    xaxis=dict(
        rangeselector=dict(
            buttons=list([
                dict(count=7,
                     label="1 Week",
                     step="day",
                     stepmode="backward",
                    visible=True,
                    ),
                dict(count=14,
                     label="2 Week",
                     step="day",
                     stepmode="backward",
                    visible=True),
                dict(count=1,
                     label="1 Month",
                     step="month",
                     stepmode="backward",
                    visible=True),
                dict(count=6,
                     label="6 Months",
                     step="month",
                     stepmode="backward",
                    visible=True),
                dict(count=1,
                     label="Year To Date",
                     step="year",
                     stepmode="todate",
                    visible=True),
                dict(count=1,
                     label="1 Year",
                     step="year",
                     stepmode="backward",
                    visible=True),
                dict(step="all"),
                 
            ]),
            
            
            
        ),
       
        
        rangeslider=dict(
            visible=True,
            bgcolor= 'lightgrey'
        ),
        
        type="date"
    ),
template="plotly_dark",
xaxis_rangeselector_font_color='black',
xaxis_rangeselector_activecolor='red',
xaxis_rangeselector_bgcolor='green'
)

fig.update_xaxes(showline=False, showgrid=False, linewidth=2, linecolor='black', gridcolor='black', title_font=dict(size=30))
fig.update_yaxes(showline=False, showgrid=False, linewidth=2, linecolor='black', gridcolor='black', title_font=dict(size=30))






# buttons
# fig.show()
# fig = go.Figure()
# # Create and style traces
# fig.add_trace(go.Scatter(x=df['date_range'], 
#                          y=df['Weightkg'], name='Weight Trend',
#                          line=dict(color='green', width=2)))

# fig.add_trace(go.Scatter(x=df['date_range'], 
#                          y=df['Weightkg_rolling_7'], 
#                          name='7 day Rolling Weight Average',
#                          line=dict(color='royalblue', width=2)))

# fig.update_layout(
#     width=1000,
#     height=500,
#     autosize=False,
#     margin=dict(t=0, b=0, l=0, r=0),
#     template="plotly_dark"
# )

  
    
# fig.update_layout(
#     xaxis=dict(
#         rangeselector=dict(
#             buttons=list([
#                 dict(count=7,
#                      label="1w",
#                      step="day",
#                      stepmode="backward",
#                     visible=True),
#                 dict(count=14,
#                      label="2w",
#                      step="day",
#                      stepmode="backward",
#                     visible=True),
#                 dict(count=1,
#                      label="1m",
#                      step="month",
#                      stepmode="backward",
#                     visible=True),
#                 dict(count=6,
#                      label="6m",
#                      step="month",
#                      stepmode="backward",
#                     visible=True),
#                 dict(count=1,
#                      label="YTD",
#                      step="year",
#                      stepmode="todate",
#                     visible=True),
#                 dict(count=1,
#                      label="1y",
#                      step="year",
#                      stepmode="backward",
#                     visible=True),
#                 dict(step="all")
#             ])
 
#         ),
#         rangeslider=dict(
#             visible=True
# #             ,bgcolor= 'darkred'
#         ),
        
#         type="date"
#     ),
# template="plotly_dark",
# xaxis_rangeselector_font_color='black',
# xaxis_rangeselector_activecolor='red',
# xaxis_rangeselector_bgcolor='green',
# )
# fig.update_xaxes(showline=False, showgrid=False, linewidth=2, linecolor='black', gridcolor='black')
# fig.update_yaxes(showline=False, showgrid=False, linewidth=2, linecolor='black', gridcolor='black')




# Creating a metrics dataframe to have metrics cards for weekly difference in averages
metrics = df.tail(14)


# fig1 = go.Figure()


# fig1.add_trace(go.Indicator(
#     value = metrics['count'].tail(7).mean(),
#     delta = {'reference': 6000},
#     gauge = {
#         'axis': {'visible': True}},
#     domain = {'row': 0, 'column': 0}))


# fig1.update_layout(
#     grid = {'rows': 1, 'columns': 1, 'pattern': "independent"},
#     template = {'data' : {'indicator': [{
#         'title': {'text': "Weekly Average Steps"},
#         'mode' : "number+delta+gauge",
#         'delta' : {'reference': 90}}]
#                          }})



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


cc = st.columns(4)

with cc[0]:
    
 # can just use 'good', 'bad', 'neutral' sentiment to auto color the card
    hc.info_card(title='Some heading GOOD', content='All good!', sentiment='good',bar_value=55,
                theme_override={'bgcolor': '#EFF8F7','title_color': '#2A4657','content_color': 'green','progress_color': 'green','icon_color': 'black', 'icon': "fa-regular fa-user"})

with cc[1]:
    hc.info_card(title='Some BAD BAD', content='This is really bad',bar_value=12, sentiment='bad'
#                  ,theme_override=theme_bad
                )

with cc[2]:
    hc.info_card(title='Some NEURAL', content='Oh yeah, sure.', sentiment='neutral',bar_value=55)

with cc[3]:
 #customise the the theming for a neutral content
    hc.info_card(title='Some NEURAL',content='Maybe...',key='sec',bar_value=5, sentiment='neutral'
#                  ,theme_override=theme_neutral
                )


st.markdown("""<hr style="height:10px;border:none;color:#333;background-color:#333;" /> """, unsafe_allow_html=True)


st.markdown("<i> Chart below is used to view the trend of health markers since none of those health marker collection technique is accurate; Hence please select individual option from dropdown", unsafe_allow_html=True)

# st.subheader("Metrics card testing features")

# p1, p2, p3, p4 = st.columns([1,1,1,1]) 
# p1.plotly_chart(fig1
#                 , use_container_width=True
#                )
# p2.metric(label="Body Fat%",
#             value=round(metrics.tail(7)['Body_Fat%'].mean(),2),
#             delta=round(metrics.tail(7)['Body_Fat%'].mean() - metrics.head(7)['Body_Fat%'].mean(), 2))
            
            
# p3.metric(label="Weight (Kg)",
#             value=round(metrics.tail(7)['Weightkg'].mean(),2), 
#             delta=round(metrics.tail(7)['Weightkg'].mean() - metrics.head(7)['Weightkg'].mean(),2))

# p4.metric(label="BMR (KCAL)",
#             value=round(metrics.tail(7)['BMRkcal'].mean(),2), 
#             delta=round(metrics.tail(7)['BMRkcal'].mean() - metrics.head(7)['BMRkcal'].mean(),2))            
st.subheader("Trend on Health Markers")
st.plotly_chart(fig
#                 , use_container_width=True
               )










