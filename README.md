# Path to Fitness

<h2>Backstory</h2>
<p align="justify"> If you know me personally then you know that I am very passionate about fitness and have devoted significant amount of my time into getting fit over the period of years. During pandemic due to gym closures, I put on some extra kgs and had to undergo a <a href="https://www.healthline.com/nutrition/body-recomposition">body recomponsition</a> over certain months. I have been collecting data for sometime and got an idea to make it into an interesting data project. So you can find the details for the project below:</p>


<h2>Objective</h2>
<p align="justify">Objetive of this product was to get data across various platforms <b>(Data Ingestion Layer)</b> and present it in a manner where I can track it and hold myself accountable. I ended up using <a href="https://https://streamlit.io">Streamlit</a> since it wouldn't be that computationally heavy and I don't plan on scaling it in future.</p> 

<h2>Data Sources, Project planning & Thinking process</h2>

<p align="justify">Initially whenever you start working on a data project, try to think of an end goal or an objective that you want to achieve from the project. My objective was to build an interface that can help me track my health markers on a regular basis. There are certain health markers that I'd track to see if I am on a right journey i.e. Weight(Kg), BodyFat, BodyWater%, SkeletalMuscle%, BMR.</p>

<p align="justify">I had been collecting data over 4 different data sources as listed below, so I started gathering data from each one of them and thinking if it can be automated, answer to my question was <b>no</b> since for some of them had no api, so it would have to be a manual pull always.</p>

Below are the data sources which would be used for getting data

1. Weighing scale data
2. MyFitness Pal
3. Garmin watch
4. Samsung Health 

 <h3>Data Gathering</h3>
  
 <h4>Weighing scale data</h4>
  
<p align="justify">I have one of those bluetooth weighing scale that uses bioimpedence technology for measuring body fat% and other health markers. This technology is not accurate but I didn't need an accurate number since I was going to look at the trend to track my progress. This is one thing that an analyst should always keep in mind while doing projects, are you aiming for an accurate result or are you trying to track something. If your project is to track aquistion rate for it to be implemented into one of the marketing campaign then, yes you need to care about it, but if you were to measure your aquistion rate for measuring the performance of any program implemented to improve aquistion then you don't care about accurate value as much as the first scenario.</p>
  
<p align="justify">My Weighing scale company didn't have any api so I ended up pulling the data manually from my phone by date selection and using it in my project. So there is no future scope of automating this data source</p>
  

<h4>MyFitness Pal</h4>
<p align="justify">I have been recording my calorie intake for the period I was trying to cut, so I would be pulling my calorie intake data from MFP. It does have an API whcih at the time was only being offered for the commercial usage purposes. This data source can be automated via API in future given that they allow the individual users to use their API.</p>
 
<h4>Garmin Watch</h4>
<p align="justify">Garmin has multiple API so, this data source would definitely be automated in future given that its API pull provides the data that is being fed into the dashboard</p>
  
  
<h4>Samsung Health</h4>
<p align="justify">Samsung API is similar to Myfitness Pal API at the time of building this project. It would only be available for commercial use or if you can prove "strategic" use of the API. Hence there is a chance to automate this data source given that it is available to small scale developers</p>
  

<h2>Execution</h2>
<p align="justify"> Here is the data flow structure for understanding it </p>

<kbd>
<p align="center">
  <img src=https://github.com/jayrajparmar009/path_to_fitness/blob/main/Logos/flow_pic.png width="1200" height="600" alt="accessibility text">
</p></kbd>
 
<p align="justify">I have structured this project as all the individual data sources would have their own functions for clearning data and it would be stored as a .py script. Those .py scripts would be called as a package in jupyter notebook for each data sources and then create a final stage table for each data sources. Finally all the staged data are being merged to create a master data table and stored on AWS S3, where it would be consumed by streamlit.</p>

 

Final Data Product can be viewed on the link below:

<src>https://jayrajparmar009-path-to-f-data-integrationstreamlit-demo-cno1b6.streamlit.app/</src>

<kbd>
<p align="center">
  <img style="border: 10px solid white;" src=https://github.com/jayrajparmar009/path_to_fitness/blob/main/Logos/dashboard_pic.png width="1200" height="600">
</p>
</kbd>





