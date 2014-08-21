import sys
import os
import subprocess

import os

abspath = os.path.abspath(__file__)
dname = os.path.dirname(abspath)
os.chdir(dname)


try:
	retcode = subprocess.call(["java", "-version"])
	if retcode < 0:
		print >> sys.stderr, "Java not in Path", -retcode
	else:
		print >> sys.stderr, "Child returned", retcode
except OSError as e:
    print >>sys.stderr, "Execution failed:", e

# print >> sys.stderr, "Current Working directory:", os.getcwd()
appdir = os.path.dirname(os.path.dirname(__file__))

if not appdir:
    appdir = os.getcwd();
else:
    print >> sys.stderr, "App directory:", appdir


c1 = os.path.join(appdir, "bin", "apache-flume-1.3.1-bin", "lib", "*")
c2 = os.path.join(appdir, "bin", "apache-flume-1.3.1-bin", "lib", "flume-ng-node-1.3.1.jar")
c3 = os.path.join(appdir, "bin", "dtFlume.jar")

classpath = c1 + os.pathsep + c2 + os.pathsep + c3

print >> sys.stderr, "Class path:", classpath

log4j = os.path.join(appdir,"bin", "apache-flume-1.3.1-bin", "conf", "log4j.properties")


flumeconf = os.path.join(appdir,"bin","flume-conf.properties");

#print >> sys.stderr, "java  -Xmx20m -Dlog4j.configuration=file:" + log4j + " -cp " + classpath + " org.apache.flume.node.Application -f flume-conf.properties -n agent1"

cmdline = "java  -Xmx20m -Dlog4j.configuration=file:" + log4j + " -cp " + classpath + " org.apache.flume.node.Application -f " + flumeconf + " -n agent1"


try:
	p = subprocess.Popen(['java', '-Xmx20m', '-Dlog4j.configuration=file:%s' % log4j,'-cp', classpath, 'org.apache.flume.node.Application', '-f', flumeconf, '-n', 'agent1'], stdout=subprocess.PIPE)
	cmdout,cmderr =  p.communicate()
	retcode = p.wait()
	if retcode < 0:
		print >>sys.stderr, "Child was terminated by signal", -retcode
	else:
		print >>sys.stderr, "Child returned", retcode
except OSError as e:
	print >>sys.stderr, "Execution failed:", e



