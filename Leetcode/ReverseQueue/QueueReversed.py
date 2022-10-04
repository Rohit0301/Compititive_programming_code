class Stack:
     def __init__(node):
         node.data = []

     def Empty(node):
         return node.data == []

     def push(node, data):
         node.data.append(data)

     def pop(node):
         return node.data.pop()
class Queue:
    def __init__(node):
        node.data = []

    def Empty(node):
        return node.data == []

    def enQueue(node, data):
        node.data.insert(0,data)

    def deQueue(node):
        return node.data.pop()

def Reverse():
    while( not Q.Empty()):
        S.push(Q.deQueue())
    while( not S.Empty()):
        Q.enQueue(S.pop())

S = Stack() 
Q = Queue()

Q.enQueue(5)
Q.enQueue(4)
Q.enQueue(3)
Q.enQueue(2)
Q.enQueue(1)

print(Q.data)
Reverse()
print(Q.data)