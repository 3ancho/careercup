from Node import *


head = Node(1)
a = head
a.next = Node(2)
a.next.next = Node(3)
a.next.next.next = Node(4)

n = 1

length = 0
cur = head
while cur != None:
    length += 1
    cur = cur.next

i = length - n

cur = head
while i != 0:
    cur = cur.next
    i = i - 1

print cur.data
