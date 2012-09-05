# Given an image represented by an NxN matrix, where each pixel in the image is 4 bytes, 
# write a method to rotate the image by 90 degrees Can you do this in place?

# 1 2 3 
# 4 5 6
# 7 8 9
#   |
#   |
# 3 6 9
# 2 5 8
# 1 4 7

# a[3][3]
import sys

m = int(sys.argv[1])
k = 1

a = []
for j in range(m):
    temp = [''] * m 
    a.append(temp)

for i in range(m):
    for j in range(m):
        a[i][j] = k
        k += 1

for i in range(m):
    for j in range(m):
        print str(a[i][j]).ljust(4),
    print ""

print "create done"

# swap
for i in range(m):
    for j in range(i):
        temp = a[i][j]
        a[i][j] = a[j][i]
        a[j][i] = temp
# swap2

for i in range(m/2):
    temp = a[i]
    a[i] = a[m-i-1]
    a[m-i-1] = temp

for i in range(m):
    for j in range(m):
        print str(a[i][j]).ljust(4),
    print ""

