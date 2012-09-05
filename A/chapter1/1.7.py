# Assume you have a method isSubstring which checks if one word is a substring of another Given two strings, 
# s1 and s2, write code to check if s2 is a rotation of s1 using only one call to isSubstring 
# (i e , "waterbottle" is a rotation of "erbottlewat")

import sys

def test_rotate(s1, s2):
    s1 = s1 * 2
    if s2 in s1:
        return True
    else:
        return False

if __name__ == "__main__":
    s1 = sys.argv[1]
    s2 = sys.argv[2]
    print test_rotate(s1, s2) 

