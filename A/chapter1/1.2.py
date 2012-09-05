a = "abced\n"
b = ""

for index, item in enumerate(a):
    b = ( index != len(a) -1 ) and item + b or b + "\n"
print b
