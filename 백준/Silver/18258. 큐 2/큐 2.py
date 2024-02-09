import sys
from collections import deque
n = int(sys.stdin.readline())

q = deque()

for _ in range(n):
    command = sys.stdin.readline().split()

    if command[0] == 'push':
        q.append(command[1])

    elif command[0] == 'pop':
        print(q.popleft()) if len(q) != 0 else print(-1)
        
    elif command[0] == 'size':
        print(len(q))

    elif command[0] == 'empty':
        print(1 if len(q) == 0 else 0)
            
    elif command[0] == 'front':
        if (len(q) == 0):
            print(-1)
        else:
            print(q[0])
    
    elif command[0] == 'back':
        if (len(q) == 0):
            print(-1)
        else:
            print(q[-1])