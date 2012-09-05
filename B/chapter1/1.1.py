#!/usr/bin/env python

def main():
    for i in range(0,5):
        print fib2(i)


def fib(n):
    if n == 0 or n == 1:
        return 1
    else:
        return fib(n-1) + fib(n-2)

def fib2(n):
    if n == 0 or n == 1:
        return 1
   
    pre = 1
    prepre = 1
    for i in range(2, n + 1):
        temp = pre
        pre = pre + prepre
        prepre = temp
    return pre
        
if __name__ == '__main__':
    main()
