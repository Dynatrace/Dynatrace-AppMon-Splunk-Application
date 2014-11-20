
Splunk Application
=========================
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
            <img  height="100px" src="images_community/download/attachments/25789254/logo_splunk_white_high.png" alt="images_community/download/attachments/25789254/logo_splunk_white_high.png" class="confluence-embedded-image image-left" />
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
                  <p>Peter Kaiser (<a href="https://community/display/DL/Big+Data+Business+Transaction+Bridge">Big Data Business Transaction Bridge</a> used internally by the Splunk Application)    </p>
               </td>
            </tr>
            <tr>
                <td rowspan="1" colspan="1"><p>License    </p></td>
                <td rowspan="1" colspan="1"><p><a href="attachments_5275722_2_dynaTraceBSD.txt">dynatrace BSD</a>    </p>   
                </td>
            </tr>
            <tr>
                <td rowspan="1" colspan="1"><p>Support    </p></td>
                <td rowspan="1" colspan="1"><p><a href="https://community/display/DL/Support+Levels#SupportLevels-Community">Not Supported </a>    </p>
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
 
