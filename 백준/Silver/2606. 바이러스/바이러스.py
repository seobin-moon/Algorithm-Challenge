from collections import deque

def bfs(start, visited):
    queue = deque([start])
    cnt = 0
    visited[start] = True
    while queue:
        v = queue.popleft()
        for i in graph[v]:
            if visited[i] == False:
                visited[i] = True
                queue.append(i)
                cnt += 1
    print(cnt)

n = int(input()) 
conn = int(input())  
visited = [False] * (n+1)  

graph = [[] for _ in range(n+1)]  
for i in range(1, conn+1):
    node1, node2 = map(int, input().split())
    graph[node1].append(node2)
    graph[node2].append(node1)

bfs(1, visited)
