import sys

a = sys.argv[1]

index = 0
end = [None] * len(a) 

for item in a:
    if item not in end:
        end[index] = item
        index += 1

end = "".join(end[:index])
print end

