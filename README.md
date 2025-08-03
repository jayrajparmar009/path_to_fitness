


# <p align="center">Path to Fitness
<p align="center"> <img src="https://img.shields.io/badge/Platform-Streamlit-FF4B4B?style=for-the-badge&logo=streamlit&logoColor=white" /> <img src="https://img.shields.io/badge/Cloud-AWS%20S3-FF9900?style=for-the-badge&logo=amazon-aws&logoColor=white" /> <img src="https://img.shields.io/badge/Data%20Sources-Multiple-00BFFF?style=for-the-badge&logo=databricks&logoColor=white" /> <img src="https://img.shields.io/badge/Status-Personal%20Project-7B2FF7?style=for-the-badge" /> </p>


<h2>🌟 Backstory</h2>
<p align="justify"> Fitness has always been a core part of my life. Over the years, I’ve dedicated significant time and effort toward improving my health and physical performance. However, during the pandemic, with gyms closed, I gained a few extra kilograms and had to undergo a <a href="https://www.healthline.com/nutrition/body-recomposition">body recomponsition</a> to get back on track.

Throughout this journey, I was consistently collecting personal health data. Eventually, I decided to transform this data into a structured analytics project — one that could help me track my fitness metrics and hold myself accountable. This repository documents that project.</p>




<h2>🎯 Objective</h2>
<p align="justify">The primary goal of this project was to <b>aggregate fitness data from multiple platforms (forming a data ingestion layer)</b> and present it in an easy-to-use dashboard for personal tracking and accountability.

I chose <a href="https://https://streamlit.io">Streamlit</a> to build the interface because it is lightweight, interactive, and well-suited for personal projects that don’t require heavy computational resources or large-scale deployment.</p> 



<h2>🗂 Data Sources</h2>
<p align="justify">Data aggregated from four different platforms:</p>
<ul>
  <li><b>Weighing Scale</b>: Bioimpedance-based metrics (weight, body fat, water %)</li>
  <li><b>MyFitnessPal</b>: Calorie and macronutrient tracking</li>
  <li><b>Garmin Watch</b>: Activity, heart rate, and workout tracking</li>
  <li><b>Samsung Health</b>: Supplementary health metrics</li>
</ul>

<blockquote>
<b>Note:</b> Some APIs (e.g., Garmin) allow automation, while others (e.g., weighing scale) require manual export due to limited API availability.
</blockquote>

<hr/>

<h2>🧠 Project Design & Architecture</h2>

<h3>Key Considerations</h3>
<ul>
  <li>Focused on <b>trend tracking</b> vs. absolute accuracy</li>
  <li>Modular scripts for each data source</li>
  <li>Master dataset stored in <b>AWS S3</b> and consumed by Streamlit</li>
</ul>

<h3>Data Flow</h3>
<p align="center">
  <img src="https://github.com/jayrajparmar009/path_to_fitness/blob/main/Logos/flow_pic.png" width="900" alt="Data Flow Diagram"/>
</p>

<hr/>

<h2>🚀 Dashboard</h2>

<h3>Live Demo</h3>
<p>
<a href="https://pathtofitness.streamlit.app/"><b>Path to Fitness Dashboard →</b></a>
</p>

<p align="center">
  <img src="https://github.com/jayrajparmar009/path_to_fitness/blob/main/Logos/dashboard_pic.png" width="900" alt="Dashboard Screenshot"/>
</p>

<hr/>

<h2>📈 Key Features</h2>
<ul>
  <li>Unified view of <b>fitness metrics</b> across multiple sources</li>
  <li>Lightweight <b>Streamlit UI</b> optimized for personal use</li>
  <li>Data pipeline designed with <b>scalable modularity</b> (each source = separate script)</li>
  <li>Ability to add automation when APIs become available</li>
</ul>

<hr/>

<h2>🔮 Future Enhancements</h2>
<ul>
  <li>API integration for MyFitnessPal & Samsung Health</li>
  <li>Advanced analytics: correlations between sleep, caloric intake, and performance</li>
  <li>Predictive modeling for weight and body composition trends</li>
</ul>

<hr/>





