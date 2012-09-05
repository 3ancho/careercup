#!/usr/bin/env python

def main():
    print "Please input n:",
    n = raw_input()
    if not n.isdigit():
        print "Pleasen input a number"
        return
    n = int(n)
    count = 0
    for i in range(1, n + 1):
        for j in str(i):
            if j == "2":
                count += 1
                print str(i)

if __name__ == '__main__':
    main()
