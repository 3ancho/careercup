# Write an algorithm such that if an element in an MxN matrix is 0,
# its entire row and column is set to 0

# 0 0 0 0 0
# 
# 1 2 3 4 0
# 
# 1 3 4 5 0

import sys
import random

class Matrix:

    # create empty matrix
    def __init__(self, m, n):
        self.m = m
        self.n = n
        self.a = []
        for i in range(self.m):
            temp = ['#'] * self.n 
            self.a.append(temp)

    def add_zero(self):
        for i in range(self.m):
            for j in range(self.n):
                self.a[i][j] = random.randint(0, 20)

    def pp(self):
        for i in range(self.m):
            for j in range(self.n):
                print str(self.a[i][j]).ljust(4),
            print ""
        print ""

    def zero_out(self):
        l = []
        for i in range(self.m):
            for j in range(self.n):
                if (i, j) in l:
                    continue
                if self.a[i][j] == 0:
                    for jj in range(self.n):
                        self.a[i][jj] = 0
                        l.append((i,jj))
                    for ii in range(self.m):
                        self.a[ii][j] = 0
                        l.append((ii,j))
                # end if
            # end for


    def zero_out2(self):
        points = []
        for i in range(self.m):
            for j in range(self.n):
                if self.a[i][j] == 0:
                    points.append((i,j))
        for point in points:
            for i in range(self.n):
                self.a[point[0]][i] = 0
            for i in range(self.m):
                self.a[i][point[1]] = 0

if __name__ == "__main__":
    m = int(sys.argv[1])
    n = int(sys.argv[2])

    m = Matrix(m, n)
    m.add_zero()
    m.pp()
    m.zero_out2()
    m.pp()

