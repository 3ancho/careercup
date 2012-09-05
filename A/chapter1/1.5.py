import re
a = "Hi    there, this is ruoran"

print re.sub(r'[ ]', '%20', a)
