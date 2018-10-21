import json
import sys
from subprocess import call

with open('d.json') as f:
	data = json.load(f)

#print(data["Dependencies"])

#call(["sudo","-i"])
call(["sudo","apt-get", "install", "python-pip"])
ll = []
sz = len(data["Dependencies"])
co=0
for x in data["Dependencies"]:
    dd = call(["sudo","pip", "install", x])  # call method returns 0 if successful else return non-zero number
    if dd != 0:
	    ll.append(x)
    else:
    	co+=1

if len(ll)!=0:
	print("Following packages couldnt be installed:")
	for i in ll:
		print("==> "+str(i))

print("Total packages installed => "+str(co)+" out of "+str(sz))