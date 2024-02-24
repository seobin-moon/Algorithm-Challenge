import sys
from collections import deque

input = sys.stdin.readline

while True:
    check = True
    sentence = input()

    if sentence[0] == '.':
        break

    q = deque()

    for i in sentence:
        if i == '(' or i == '[':
            q.append(i)

        elif i == ']':
            if not q or q[-1] == '(':
                check = False
                break

            elif q[-1] == '[':
                q.pop()

        elif i == ')':
            if not q or q[-1] =='[':
                check = False
                break

            elif q[-1] == '(':
                q.pop()

    if not q and check is True:
        print('yes')

    else:
        print('no')