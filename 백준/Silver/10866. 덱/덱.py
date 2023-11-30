from collections import deque
import sys

n = int(sys.stdin.readline())
q = deque()

def empty():
    if len(q) == 0:
        return 1
    else:
        return 0
        
def size():
    return len(q)

for i in range(n):
    inputString = list(sys.stdin.readline().split())

    if inputString[0] == 'push_front':
        q.appendleft(inputString[1])

    elif inputString[0] == 'push_back':
        q.append(inputString[1])

    elif inputString[0] == 'pop_front':
        if empty() == 1:
            print("-1")
        else:
            tmp = q.popleft()
            print(tmp)

    elif inputString[0] == 'pop_back':
        if empty() == 1:
            print("-1")
        else:
            tmp = q.pop()
            print(tmp)

    elif inputString[0] == 'front':
        if empty() == 1:
            print("-1")
        else:
            print(q[0])

    elif inputString[0] == 'back':
        if empty() == 1:
            print("-1")
        else:
            print(q[len(q)-1])

    elif inputString[0] == 'size':
        print(size())

    elif inputString[0] == 'empty':
        print(empty())
