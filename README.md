
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <link type="text/css" rel="stylesheet" href="css/blueprint/liquid.css" media="screen, projection"/>
    <link type="text/css" rel="stylesheet" href="css/blueprint/print.css" media="print"/>
    <link type="text/css" rel="stylesheet" href="css/content-style.css" media="screen, projection, print"/>
    <link type="text/css" rel="stylesheet" href="css/screen.css" media="screen, projection"/>
    <link type="text/css" rel="stylesheet" href="css/print.css" media="print"/>
</head>

<body>
    <div class="container" style="min-width: 760px;">
        <div class="block">
            <div id="117440771" class="content column span-18 last">
    <p>
            <img  height="40px" src="images_community/download/attachments/25789254/logo_splunk_white_high.png" alt="images_community/download/attachments/25789254/logo_splunk_white_high.png" class="confluence-embedded-image image-left" >dynatrace App for Splunk 
=========================
</img>
            </p>
    <p>
This Application enables a seamless way to store Business Transactions and Alerts in Splunk for further analysis by correlating your Splunk data with dynatrace Business Transaction data.    </p>
<ul class=" "><li class=" ">    <p>
Zero Configuration with out-of-the-box    </p>
</li><li class=" ">    <p>
Stream real-time Business Transaction data to <a href="http://www.splunk.com">Splunk</a>    </p>
<ul class=" "><li class=" ">    <p>
All transactions 24/7    </p>
</li><li class=" ">    <p>
End User Perspective    </p>
</li><li class=" ">    <p>
Discrete Business aware transactions    </p>
</li></ul></li><li class=" ">    <p>
Push Baseline violations, smart alerts &amp; application exceptions to <a href="http://www.splunk.com">Splunk</a>    </p>
</li><li class=" ">    <p>
Push Application, Business Transaction and Infrastructure metrics to <a href="http://www.splunk.com">Splunk</a>    </p>
</li><li class=" ">    <p>
Launch the Dynatrace client for a single transactions and alerts from within <a href="http://www.splunk.com">Splunk</a>    </p>
</li><li class=" ">    <p>
Drill-down to root-cause, export &amp; share with your team    </p>
</li></ul>    <div class="section-2"  id="117440771_SplunkApplication-LibraryDetails"  >
        <h2>Library Details</h2>
<div>
<table>
            <thead class=" "></thead><tfoot class=" "></tfoot><tbody class=" ">    
            <tr>
               <td rowspan="1" colspan="1"><p>Name    </p></td>
               <td rowspan="1" colspan="1"><p><strong class=" ">dynatrace Splunk Application</strong>    </p></td>
            </tr>
            <tr>
               <td rowspan="1" colspan="1"><p>Version    </p></td>
               <td rowspan="1" colspan="1"><p>2.1    </p></td>
            </tr>
            <tr>
               <td rowspan="1" colspan="1"><p>dynaTrace Version    </p></td>
               <td rowspan="1" colspan="1"><p>5.5+    </p></td>
            
            </tr>
            <tr>
               <td rowspan="1" colspan="1"><p>Authors    </p></td>
               <td rowspan="1" colspan="1">
                  <p>Rajesh Jain (Owner)</p>
                  <p>Michael Kopp</p>
                  <p>Yiaochung Lee and Wilson Lai (initial splunk application) ,</p>
                  <p>Ardeshir Arfaian (initial splunk alert),</p>
                  <p>Peter Kaiser (<a href="https://community.compuwareapm.com/community/display/DL/Big+Data+Business+Transaction+Bridge">Big Data Business Transaction Bridge</a> used internally by the Splunk Application)    </p>
               </td>
            </tr>
            <tr>
                <td rowspan="1" colspan="1"><p>License    </p></td>
                <td rowspan="1" colspan="1"><p><a href="attachments_5275722_2_dynaTraceBSD.txt">dynatrace BSD</a>    </p>   
                </td>
            </tr>
            <tr>
                <td rowspan="1" colspan="1"><p>Support    </p></td>
                <td rowspan="1" colspan="1"><p><a href="https://community.compuwareapm.com/community/display/DL/Support+Levels#SupportLevels-Community">Not Supported </a>    </p>
                </td>
            </tr>
            <tr>
                <td rowspan="1" colspan="1"><p>Contents    </p></td>
                <td rowspan="1" colspan="1">
                <p><a href="attachments_173801608_1_APM_dynatrace.tar.gz">dynaTrace App for Splunk</a></p>
                <p><a href="attachments_117833759_2_com.compuware.splunkintegration_1.0.0.jar">DynaTrace Splunk Alert Plugin</a></p>
                <p><a href="attachments_122322946_1_Splunk_Business_Transactions.profile.xml">Splunk Business Transactions template profile</a></p>
                </td>
            </tr>
        </tbody>        
        </table>
</div>

    
<div>
    <h2>Release Notes v 2.1</h2>
    <p>In this release we have changed the startup script of flume server and the input scripts for Splunk. We use python scripts which are platform independent. You will see only three scripts runFlume.py, runDashboard.py and cleanFlume.py in this version which replaces all the previous bat/sh/curl scripts and processes    </p>
    <p>In case you are using the Google Maps Plugin, there are some config / permission issues with the GeoLiteData.dat file which may not allow you to use the maps view with this app. But you can install the Google Maps Plugin and search within that App context for dynaTrace visits.    </p>
</div>

<div>
    <h2>Release Notes v 2.0    </h2>
    <p>The dynaTrace , Splunk App Version 2.0 is available on the Splunk App Store <a href="http://apps.splunk.com/app/1593/">http://apps.splunk.com/app/1593/</a>    </p>
    <p>V 2.0 has major changes in the OOB Dashboards which are populated with APM data from dynaTrace.
    Application at Glance : Gives you at glance view of the Applications, Visitors and Critical Transactions    </p>
    <p><img src="images_community/download/attachments/117440771/1.PNG" alt="images_community/download/attachments/117440771/1.PNG" class="" /></p>
    <p>Visitors on a Map: Gives you a geographical view of your visitors, with the ability to zero on a single visit</p>
    <p><img src="images_community/download/attachments/117440771/2.PNG" alt="images_community/download/attachments/117440771/2.PNG" class="" /></p>
    <p>Key Analytic Metrics: Allows you to share analysis APM data for business analysis and effectiveness of your web/app properties</p>
    <p><img src="images_community/download/attachments/117440771/3.0.PNG" alt="images_community/download/attachments/117440771/3.0.PNG" class="" /></p>
    <p>Transaction Activity Data and User Activity Data: Gives you a timeline view of your transactions, so you can understand at what time of the day certain transactions are heavily used or not.    </p>
    <p><img src="images_community/download/attachments/117440771/4.PNG" alt="images_community/download/attachments/117440771/4.PNG" class="" /></p>
    <p>The Splunk App also has a pivot data model to start with, which an be used to create models around User Activity, Visits and Transaction Health and leverage the Splunk platform for Analysis.The Splunk App for Linux platform has a cleanup script to clean the log files once they have been ingested.</p>
</div>   

</body>
</html>
<div >
    <h2>Prerequisites</h2>
    <p>You will need dynaTrace 5.5 with enabled Business Transaction Export. You will also need a recent version of Splunk, this Application has been tested with Splunk 6 Windows and Linux! You Splunk box needs to have Java 6 or higher installed.    </p>
</div>
    
<div class="section-2"  id="117440771_SplunkApplication-QuickStartGuide-ThreeEasySteps"  >
    <h2>Quick Start Guide - Three Easy Steps</h2>

<div class="section-3"  id="117440771_SplunkApplication-Step1%3AInstalltheSplunkAppfromtheAppStore"  >
    <h3>Step 1: Install the Splunk App from the App Store</h3>
    <p>Download the APM_dynaTrace file from the attachments or from the Splunk Store <a href="http://apps.splunk.com/app/1593/">http://apps.splunk.com/app/1593/</a>    </p>
    <p>Open Splunk, Click on Splunk Icon -&gt; Manage Apps and Install app from file.    </p>
</div>

<div class="section-3"  id="117440771_SplunkApplication-Step2%3AEnableBusinessTransactionsFeed"  >
    <h3>Step 2: Enable Business Transactions Feed</h3>    
    <p>Open dynaTrace Client -&gt; Server Settings -&gt; (Export) Business Transaction Feeds    </p>
    <p>Insert the URL of the Flume (Splunk) server. The default port of the flume server running on the Splunk server is 4321    </p>
    <p><img src="images_community/download/attachments/117440771/6.PNG" alt="images_community/download/attachments/117440771/6.PNG" class="" /> </p>
 </div>
    
 <div class="section-3"  id="117440771_SplunkApplication-Step3%3AExportBusinessTransactions"  >
    <h3>Step 3: Export Business Transactions</h3>
    <p><span style="color: #505050;"></span>Select the Business Transactions you would like to export, edit the Business Transaction and select export results.    </p>
    <p><img src="images_community/download/attachments/117440771/splunk5.png" alt="images_community/download/attachments/117440771/splunk5.png" class="" />
    </p>
    <p>
    </p>
    <p><i class=" ">Good Luck, you should start seeing data in dynaTrace App for Splunk</i>    </p>
    <p>
    </p>
 </div>
    
 </div>
 
 <div class="section-2"  id="117440771_SplunkApplication-DetailSetupGuide"  >
    <h2>Detail Setup Guide</h2>

<div class="section-3"  id="117440771_SplunkApplication-InstallCompuwareAPMSplunkApplication"  >
    <h3>Install Dynatrace Splunk Application</h3>

<p>
Use the Splunk Web UI to install the APM with dynaTrace Splunk Application. You can simply install the <a href="Splunk_Application.html">APM with Dynatrace Splunk App</a> as is. Once ready the app will begin listening for data on the designated host inside 5 minutes after install.    </p>
<p>
The Splunk Application contains the <a href="https://community.compuwareapm.com/community/display/DL/Big+Data+Business+Transaction+Bridge">Big Data Business Transaction Bridge</a> with a specialized flume configuration. You can edit it by going to <i class=" ">$SPLUNK_HOME/etc/apps/<i class=" ">APM_dynatrace</i>/bin</i>. Per default it will listen on port 4321, which you can change. It will write the data to the log directory in the application folder.    </p>
</div>

<div class="section-3"  id="117440771_SplunkApplication-AdaptLogdirectoryandconfigurecleanup"  >
    <h3>Adapt Log directory and configure cleanup</h3>

<p>
Default directory for the log files are in <i class=" ">$SPLUNK_HOME/etc/apps/APM_dynatrace/log</i>    </p>
<p>
On Linux we have a cleanFlume.sh which cleans the log files from this location after injestion.    </p>
<p>
You can change the log directory by modifing the <i class=" ">flume.conf</i> file in the Applications bin directory. The respective settings are    </p>
<ul class=" "><li class=" ">    <p>
agent1.sinks.purepath.sink.directory    </p>
</li><li class=" ">    <p>
agent1.sinks.pageaction.sink.directory    </p>
</li><li class=" ">    <p>
agent1.sinks.visit.sink.directory    </p>
</li><li class=" ">    <p>
agent1.sinks.alerts.sink.directory    </p>
</li></ul>    <p>
One appropriate directory on a Linux system would be <i class=" ">/var/log/dynatrace</i>. You could then use the Linux service <a href="http://linuxcommand.org/man_pages/logrotate8.html">logrotate</a> with rotate option 0 (delete and not rotate) to cleanup old data on a daily or weekly basis. On A Windows system you can do something similar with a Scheduled delete of old files.    </p>
</div>

<div class="section-3"  id="117440771_SplunkApplication-EnableBusinessTransactionFeed"  >
    <h3>Enable Business Transaction Feed</h3>

<p>
See <a href="https://community.compuwareapm.com/community/display/DOCDT55/Real+Time+Business+Transactions+Feed">Real Time Business Transactions Feed</a> on how to enable this feature. You should set the host and port to the host that runs the Splunk Application and use the default port 4321 unless you have changed it.    </p>
</div>

<div class="section-3"  id="117440771_SplunkApplication-BusinessTransactionDatainSplunk"  >
    <h3>Business Transaction Data in Splunk</h3>

<div class="section-4"  id="117440771_SplunkApplication-DefaultReportandBusinessTransactions"  >
    <h4>Default Report and Business Transactions</h4>

<p>
The Splunk Application contains a Default View called &quot;Top Countries&quot;. It shows the top converted countries, Top Landing pages and their conversion rate and the Exit Pages with conversion rates. In order for this to work add the two Business Transactions from the <a href="attachments_122322946_1_Splunk_Business_Transactions.profile.xml">Splunk Business Transactions template profile</a> to your own System Profile:    </p>
<ul class=" "><li class=" ">    <p>
Detailed Visit Data    </p>
</li><li class=" ">    <p>
Detailed User Actions    </p>
</li></ul>    <p>
        <img src="images_community/download/attachments/117440771/top_countries.png" alt="images_community/download/attachments/117440771/top_countries.png" class="" />
        </p>
</div>

<div class="section-4"  id="117440771_SplunkApplication-EnableanduseBusinessTransactions"  >
    <h4>Enable and use Business Transactions</h4>

<p>
By simply enabling the HTTP export of any Business Transactions you can now use them in splunk. The Splunk Application distinguishes between 4 source types    </p>
<ul class=" "><li class=" ">    <p>
pp - PurePath    </p>
</li><li class=" ">    <p>
pa - PageAction (Client Action)    </p>
</li><li class=" ">    <p>
visit - Visit    </p>
</li><li class=" ">    <p>
alert - Alert    </p>
</li></ul>    <p>
you can select for them easily by using the <i class=" ">sourcetype=pp</i> query expression in splunk    </p>
<p>
        <img src="images_community/download/attachments/117440771/splunk3.png" alt="images_community/download/attachments/117440771/splunk3.png" class="" />
        </p>
<p>
All fields are automatically discovered.    </p>
</div>

<div class="section-4"  id="117440771_SplunkApplication-SearchingforparticularBusinessTransactionSplittings"  >
    <h4>Searching for particular Business Transaction Splittings</h4>

<p>
In the <a href="https://community.compuwareapm.com/community/display/DOCDT55/Real+Time+Business+Transactions+Feed">Export of Business Transactions</a> splittings are called dimensions. Accordingly you can search for any dimension in splunk by filtering by the specific dimension. e.g. if you export the easyTravel Business Transaction <i class=" ">easyTravel Bookings by Location</i> you can search for locations via an expression like this    </p>
<div class="confbox programlisting">
            <div class="content">
    <pre><code>sourcetype= pp AND &quot;dimensions.Booking Location&quot; = &quot;*Zurich*&quot;</code></pre>
    </div>
</div>
<p>
You can also look at the top locations by revenue    </p>
<div class="confbox programlisting">
            <div class="content">
    <pre><code>sourcetype= pp | stats sum(measures.Revenue)  by &quot;dimensions.Booking Location&quot; | rename sum(measures.Revenue) AS revenue | sort -revenue</code></pre>
    </div>
</div>
<p>
        <img src="images_community/download/attachments/117440771/splunk4.png" alt="images_community/download/attachments/117440771/splunk4.png" class="" />
        </p>
</div>

<div class="section-4"  id="117440771_SplunkApplication-CorrelatingVisits%2CClientActionsandPurePathsandAggregatingdata"  >
    <h4>Correlating Visits, ClientActions and PurePaths and Aggregating data</h4>

<p>
Splunk has a very comprehensive query language that allows many aggregations that we know from SQL and BI tools. With this you can correlate a Visit with its respective Client Actions and PurePath by using the fields shared among them (e.g. the visitId). You can aggregate measures across different dimensions and do complex statistical analysis.    </p>
</div>

</div>

<div class="section-3"  id="117440771_SplunkApplication-SendingAlertstoSplunk"  >
    <h3>Sending Alerts to Splunk</h3>

<p>
To send alerts to splunk you need to install the attached <a href="attachments_117833759_2_com.compuware.splunkintegration_1.0.0.jar">Dynatrace Splunk Alert Plugin</a>. Once done you can use this plugin to export any alert. Simple go to the Incident, switch to the Actions tab and click on <i class=" ">Advanced Configuration</i>. You can then add the Splunk Action as an Incident Action    </p>
<p>
        <img src="images_community/download/attachments/117440771/splunk1.png" alt="images_community/download/attachments/117440771/splunk1.png" class="" />
        </p>
<p>
Set the url to <i class=" ">http://&lt;splunk_host&gt;:4321/</i>. Change the host and port accordingly.<br/>            <img src="images_community/download/attachments/117440771/splunk2.png" alt="images_community/download/attachments/117440771/splunk2.png" class="" />
        </p>
</div>

<div class="section-3"  id="117440771_SplunkApplication-PullingMeasurementdataintoSplunk"  >
    <h3>Pulling Measurement data into Splunk</h3>

<p>
This Splunk Application uses the <a href="https://community/pages/viewpage.action?pageId=114033234">dynaTrace Server REST API</a> to query dashboards and pull the measurement data from them into Splunk. to activate this you need to edit the runDashboard.sh/.bat inside the Dynatrace Splunk Application Directory    </p>
<div class="confbox programlisting">
            <div class="content">
    <pre><code>$SPLUNK_HOME/etc/apps/CompuwareAPM/bin/runDashboard.sh</code></pre>
    </div>
</div>
<ul class=" "><li class=" ">    <p>
Change the DTSERVER, USER and PWD variables according to your dynaTrace setup    </p>
</li><li class=" ">    <p>
Change the DASHBOARD to the name of the dashboard you want to use.    </p>
</li></ul>    <p>
The script will then pull the dashboard periodically (every 5 minutes on default) and retrieve the measurement data in JSON format.    </p>
<p>
If you want to retrieve multiple dashboards or from different servers simply copy/paste the script lines that do the rest and xslt call.    </p>
</div>

<div class="section-3"  id="117440771_SplunkApplication-DrilldowntodynaTrace"  >
    <h3>Drill down to dynaTrace</h3>

<p>
One of the features of this Splunk Application is that you can drill down from an alert or Business Transaction from Splunk into dynaTrace. In order to do this for Business Transactions you need to enable the PurePath Data export in a particular Business Transaction.    </p>
<p>
        <img src="images_community/download/attachments/117440771/splunk5.png" alt="images_community/download/attachments/117440771/splunk5.png" class="" />
        </p>
<p>
The Splunk events will then contain the purePathId. If this is there you will be able to use the <i class=" ">Drill down to Dynatrace</i> to open the PurePath in your local dynaTrace client. This requires that you the client is already running and connected to the correct dynaTrace Server.    </p>
<p>
        <img src="images_community/download/attachments/117440771/splunk6.png" alt="images_community/download/attachments/117440771/splunk6.png" class="" />
        </p>
<p>
You can do the same for Alerts.    </p>
<p>
In both cases the dynaTrace client must be already running on your local machine!    </p>
</div>

</div>

<div class="section-2"  id="117440771_SplunkApplication-Questions%26Ideas"  >
    <h2>Questions &amp; Ideas</h2>

<p>
If you have questions or ideas for this Splunk Application please post it in our <a href="https://community.compuwareapm.com/community/display/DTFORUM/Community+Plugins+and+Extensions">Plugin Forum</a>    </p>
</div>
</div>
