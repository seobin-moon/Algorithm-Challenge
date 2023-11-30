from sys import stdin
import heapq

def inputZero():
    try:
        print(heapq.heappop(heap))
    except:
        print(0)

def inputElse(num):
    heapq.heappush(heap,num)

heap = []

N = int(stdin.readline())
for _ in range(0,N):
    num = int(stdin.readline())
    if num == 0:
        inputZero()
    else:
        inputElse(num)
        