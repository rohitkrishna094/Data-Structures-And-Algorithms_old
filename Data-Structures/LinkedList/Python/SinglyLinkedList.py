class Node:
    def __init__(self, data, next=None):
        self.data = data
        self.next = next


class LinkedList:
    def __init__(self):
        self.head = None

    def printLL(self):
        cur = self.head
        while(cur):
            print(cur.data, end=' ')
            cur = cur.next
        print()

    def insertAtStart(self, data):
        newNode = Node(data)
        if self.head != None:
            newNode.next = self.head
        self.head = newNode

    def insertAtEnd(self, data):
        cur = self.head
        while cur.next != None:
            cur = cur.next
        cur.next = Node(data)

    def delete(self, data):
        prev = None
        cur = self.head
        while cur:
            if cur.data == data:
                if prev:
                    prev.next = cur.next
                else:
                    self.head = cur.next
                return True
            prev = cur
            cur = cur.next

        return False

    def search(self, node, data):
        if node == None:
            return False
        if node.data == data:
            return True
        return self.search(node.next, data)


l = LinkedList()
l.insertAtStart(1)
l.insertAtStart(2)
l.insertAtStart(3)
l.insertAtEnd(-9)
l.insertAtEnd(-90)
l.insertAtEnd(-990)
l.printLL()
l.delete(-9)
l.delete(2)
l.printLL()

print(l.search(l.head, 3))
