import sys

a = sys.argv[1] 
b = sys.argv[2] 

aa = 0
bb = 0
i = 0

if len(a) != len(b):
    print False
else:
    while i < len(a):
        aa += ord(a[i])
        bb += ord(b[i])
        i += 1

    print aa == bb 
