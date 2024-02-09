import sys
n = int(sys.stdin.readline())

q = [0]*2000000
sp = 0
ep = 0

for i in range(n):
    command = sys.stdin.readline().split()

    if command[0] == 'push':
        q[ep] = command[1]
        ep += 1

    elif command[0] == 'pop':
        if sp == ep:
            print(-1)
        else:
            print(q[sp])
            sp += 1
        
    elif command[0] == 'size':
        print(ep - sp)

    elif command[0] == 'empty':
        if ep == sp:
            print(1)
        else:
            print(0)
            
    elif command[0] == 'front':
        if ep == sp:
            print(-1)
        else:
            print(q[sp])
    
    elif command[0] == 'back':
        if ep == sp:
            print(-1)
        else:
            print(q[ep - 1])