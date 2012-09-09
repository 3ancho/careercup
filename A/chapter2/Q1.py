# Write code to remove duplicates from an unsorted linked list 
# FOLLOW UP
# How would you solve this problem if a temporary buffer is not allowed?


class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

if __name__ == "__main__":
    head = Node("1")
    a = head 
    a.next = Node("2")
    a.next.next = Node("3")
    a.next.next.next = Node("2")
    a.next.next.next.next = Node("3")
    a.next.next.next.next.next = Node("2")

    l = []
    pre = None
    
    i = 0
    cur = a
    while cur != None:
        print i
        i = i+1
        if not cur.data in l:
            l.append(cur.data)
            print "appending ",cur.data
            pre = cur 
        else:
            print "deleting ",cur.data
            pre.next = cur.next 
        cur = cur.next

    print l
    cur = a
    while cur != None: 
        print cur.data
        cur = cur.next


#    while True: 
#        print a.data
#        if a.next == None:
#            break
#        a = a.next
#
#    print "Start"
#
#    l = []
#    pre = None 
#
#    a=head
#    while True:
#        print l
#        if not a.data in l:
#            l.append(a.data)
#        else:
#            print "case !"
#            pre.next = a.next
#            a = a.next
#        pre = a
#        if a is None:
#            break
#        a=a.next
#
#    a=head
#    while True:
#        print a.data
#        if a.next == None:
#            break
#        a = a.next
#
#    
