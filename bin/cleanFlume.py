import os
import datetime
import sys
import subprocess


abspath = os.path.abspath(__file__)
dname = os.path.dirname(abspath)
os.chdir(dname)
appdir = os.path.dirname(os.path.dirname(__file__))

if not appdir:
    appdir = os.getcwd();
else:
    print >> sys.stderr, "App directory:", appdir

log = os.path.join(appdir,"log")


dir_to_search = log
for dirpath, dirnames, filenames in os.walk(dir_to_search):
   for file in filenames:
      curpath = os.path.join(dirpath, file)
      file_modified = datetime.datetime.fromtimestamp(os.path.getmtime(curpath))
      if datetime.datetime.now() - file_modified > datetime.timedelta(hours=24):
	  os.remove(curpath)

