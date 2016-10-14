import os
import datetime
import sys
import subprocess
from xml.etree import ElementTree
import urllib

from xml.dom import minidom

import lxml.etree as ET
from urllib2 import URLError, HTTPPasswordMgrWithDefaultRealm, HTTPBasicAuthHandler, install_opener, build_opener

# replace DTSERVER with Dynatrace Server IP and REST port
# replace DASHBOARD with URL encoded Dashboard name

DTSERVER="changeme:8020"
DASHBOARD="changeme"
TIMEFRAME="Last5Min"
USERNAME=os.environ['DTUSER']
PASSWORD=os.environ['DTPASS']
xsl_filename = "report.xsl"
feed_url = "http://"+ DTSERVER + "/rest/management/reports/create/"+ DASHBOARD + "?type=XML&format=XML+Export&filter=tf:" + TIMEFRAME

abspath = os.path.abspath(__file__)
dname = os.path.dirname(abspath)
os.chdir(dname)


# Set up a HTTPS request with username/password authentication
try:
  # create a password manager
  password_mgr = HTTPPasswordMgrWithDefaultRealm()
  # Add the username and password.
  password_mgr.add_password(None, feed_url, USERNAME, PASSWORD)
  opener = build_opener(HTTPBasicAuthHandler(password_mgr))
  file = opener.open(feed_url)

except URLError, e:
  print 'URLError: "%s"' % e
  raise

appdir = os.path.dirname(os.path.dirname(__file__))
xsl_file = os.path.join(appdir, "bin", xsl_filename)
out_dir = os.path.join(appdir,"log")

#print >> sys.stderr, "The XSL File", xsl_file

dom = ET.parse(file)
#print >> sys.stderr, "The Feed file" , ET.tostring(dom, pretty_print=True)

xslt = ET.parse(xsl_file)

#print >> sys.stderr, "The XSLT file" , ET.tostring(xslt, pretty_print=True)
transform = ET.XSLT(xslt)
newdom = transform(dom)

print str(newdom)


#print >> sys.stderr, "The New file" , str(newdom)



