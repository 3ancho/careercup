string = raw_input()

exists = []

for item in string:
    if not item in exists:
        exists.append(item)

if len(string) == len(exists):
    print "String have all unique chars"
else:
    print "String does not have all unique chars"
