class seobin_q:
    def __init__(self):
        self.q = [0]*2000000
        self.sp = 0
        self.ep = 0

    def push(self, val):
        self.q[self.ep] = val
        self.ep += 1

    def pop(self):
        if self.sp == self.ep:
            return -1
        else:
            tmp = self.q[self.sp]
            self.sp += 1
            return tmp
        
    def size(self):
        return self.ep - self.sp
    
    def empty(self):
        if self.ep == self.sp:
            return 1
        else:
            return 0
    
    def front(self):
        if self.ep == self.sp:
            return -1
        else:
            return self.q[self.sp]
        
    def back(self):
        if self.ep == self.sp:
            return -1
        else:
            return self.q[self.ep - 1]

import sys
n = int(sys.stdin.readline())

sq = seobin_q()

def execute_command(raw_command):
    command = raw_command.split()

    if command[0] == 'push':
        sq.push(command[1])

    elif command[0] == 'pop':
        print(sq.pop())
        
    elif command[0] == 'size':
        print(sq.size())

    elif command[0] == 'empty':
        print(sq.empty())
            
    elif command[0] == 'front':
        print(sq.front())
    
    elif command[0] == 'back':
        print(sq.back())

for i in range(n):
    execute_command(sys.stdin.readline())