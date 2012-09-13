# Implement an algorithm to find the nth to last element of a singly linked list

class Node:
    def __init__(self, data=None, next=None):
        self.data = data
        self.next = next

    def __str__(self):
        return str(self.data)

    def printList(node):
        while node:
            print node,
            node = node.next
        print

    def printBack(node):
        if node == None: return
        first = node
        second = node.next
        Node.printBack(second)
        print first,


        
