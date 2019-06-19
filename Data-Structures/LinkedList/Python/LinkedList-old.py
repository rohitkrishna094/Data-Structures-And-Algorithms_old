class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


class LinkedList:
    def __init__(self):
        self.head = None
        self.tail = None
        self.size = 0

    def addFirst(self, data):
        newNode = Node(data)
        newNode.next = self.head
        if self.head == None:
            self.tail = newNode
        self.head = newNode
        self.size += 1

    def addLast(self, data):
        newNode = Node(data)
        if self.tail != None:
            self.tail.next = newNode
        self.tail = newNode
        self.size += 1

    def removeFirst(self):
        pass

    def removeLast(self):
        pass

    def remove(self, data):
        pass

    def printList(self):
        cur = self.head
        while cur != None:
            print(cur.data, end=", ")
            cur = cur.next


ll = LinkedList()
ll.addFirst(25)
ll.addFirst(55)
ll.addFirst(65)
ll.addFirst(75)
print(ll.head.data, ll.tail.data)
ll.printList()
