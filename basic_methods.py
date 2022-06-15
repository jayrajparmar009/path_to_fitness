import os
import pandas as pd
import numpy as np
import matplotlib.pyplot as plt
from ipywidgets import interact, IntSlider
from IPython.display import display
import warnings
import glob
import re
warnings.filterwarnings('ignore')
# %matplotlib inline
plt.rcParams.update({'figure.figsize':(7,5), 'figure.dpi':100})
pd.set_option("display.max_columns", 100)
pd.set_option("display.max_rows", 10000)
pd.set_option('display.float_format', '{:.2f}'.format)
plt.rcParams["font.weight"] = "bold"
plt.rcParams.update({'font.size': 15})
pd.options.display.float_format = '{:,.4f}'.format












# Important functions to be used in the notebook according to analysis stage


# 1. Checks the null values in your df in terms of number and percentage 
def null_values(missing_companies):
    missing_companies = pd.concat([missing_companies.isnull().sum().sort_values(ascending = False),
                         round(missing_companies.isnull().sum()/missing_companies.isnull().count()*100,2).sort_values(ascending=False)],
                              axis=1, keys = ['counts', 'percentage'])
    missing_companies['percentage'] = missing_companies['percentage'].astype(str)+'%'
    missing_companies=missing_companies[missing_companies['counts']>0]
    return(missing_companies)


# 2. Class used for printing in different colors if needed, any method can be called as color.XXXX
class color:
   PURPLE = '\033[95m'
   CYAN = '\033[96m'
   DARKCYAN = '\033[36m'
   BLUE = '\033[94m'
   GREEN = '\033[92m'
   YELLOW = '\033[93m'
   RED = '\033[91m'
   BOLD = '\033[1m'
   UNDERLINE = '\033[4m'
   END = '\033[0m'
    
    
# 3. Used for cleaning the column names and removing any unnecessary columns by passing list of names and characters to be removed
def replace_all(df, dic):
    for i, j in dic.items():
      df.columns = df.columns.str.replace(i, j)
      return df

def clean_colnames(df, d, char, col):
  df.drop(col, axis=1,inplace=True)
  replace_all(df,d)
  df.columns = df.columns.map(lambda x: x.split(char)[0])
  return df

# 4. For freezing the heaer of the pandas dataframe


def freeze_header(df, num_rows=30, num_columns=10, step_rows=1,
                  step_columns=1):
    """
    Freeze the headers (column and index names) of a Pandas DataFrame. A widget
    enables to slide through the rows and columns.
    Parameters
    ----------
    df : Pandas DataFrame
        DataFrame to display
    num_rows : int, optional
        Number of rows to display
    num_columns : int, optional
        Number of columns to display
    step_rows : int, optional
        Step in the rows
    step_columns : int, optional
        Step in the columns
    Returns
    -------
    Displays the DataFrame with the widget
    """
    @interact(last_row=IntSlider(min=min(num_rows, df.shape[0]),
                                 max=df.shape[0],
                                 step=step_rows,
                                 description='rows',
                                 readout=False,
                                 disabled=False,
                                 continuous_update=True,
                                 orientation='horizontal',
                                 slider_color='purple'),
              last_column=IntSlider(min=min(num_columns, df.shape[1]),
                                    max=df.shape[1],
                                    step=step_columns,
                                    description='columns',
                                    readout=False,
                                    disabled=False,
                                    continuous_update=True,
                                    orientation='horizontal',
                                    slider_color='purple'))
    
    def _freeze_header(last_row, last_column):
        display(df.iloc[max(0, last_row-num_rows):last_row,
                        max(0, last_column-num_columns):last_column])



# 5. Converting time to datetime values in dataframe
def datetime_conversion(df,col_list):
    df[col_list] = df[col_list].apply(pd.to_datetime, errors = 'coerce')
    return df
        
        
# 6. Returns category distributioin of category by total rows and percentage of categories in dataset
def cat_dist(df, cat):
    cat_dist = pd.concat([df[cat].value_counts(),
           (round((df[cat].value_counts()/df.shape[0])*100,2))],
                     axis=1, keys = ['row_count', 'percentage'])
    cat_dist['percentage'] = cat_dist['percentage'].astype(str) +'%'
    return(cat_dist)
        
# 7. Getting distribution of null values by a category

def null_cat_dist(df, cat):
    cat_dist = pd.concat([df[df.Age.isnull()][cat].value_counts(),
                       (df[cat].value_counts()),
                   (round((df[cat].value_counts()/df.shape[0])*100,2))],
                     axis=1, keys = ['null_value_cnt','row_count', 'percentage_overall'])
    cat_dist['percentage_nulls'] = round(cat_dist['null_value_cnt']/cat_dist['row_count']*100,2)
    cat_dist['percentage_nulls'] = cat_dist['percentage_nulls'].astype(str) +'%'
    cat_dist.columns = ['null_value_cnt', 'row_count', 'percentage_overall',
           'percentage_nulls']
    cat_dist['percentage_overall'] = cat_dist['percentage_overall'].astype(str) +'%'
    return(cat_dist)
