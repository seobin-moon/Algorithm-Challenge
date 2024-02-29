import sys
input = sys.stdin.readline

def cal_dist(a, b):
    return abs(a[0] - b[0]) + abs(a[1] - b[1])

def solve(n, m, homes, chickens):
    answer = float('inf')
    dists = []
	# 각 치킨집으로 부터 치킨 거리를 모두 구해놓기
    for i in range(len(chickens)):
        temp = []
        for j in range(len(homes)):
            temp.append(cal_dist(chickens[i], homes[j]))
        dists.append(temp)

    def dfs(depth, selects, k):
        nonlocal answer

        if depth == m:
            # 선택한 치킨집들의 최소 치킨거리 구하기
            temp = [float('inf')] * len(homes)
            for i in selects:
                for j in range(len(homes)):
                    temp[j] = min(temp[j], dists[i][j])
            # 갱신
            answer = min(answer, sum(temp))
            return

        for i in range(k, len(chickens)):
            selects.append(i)
            dfs(depth + 1, selects, i + 1)
            selects.pop()
        return
    dfs(0, [], 0)
    return answer

# input
n, m = map(int, input().split())
chickens = []
homes = []
for i in range(n):
    temp = list(map(int, input().split()))
    for j in range(n):
        if temp[j] == 1:
            homes.append((i, j))
        elif temp[j] == 2:
            chickens.append((i, j))
print(solve(n, m, homes, chickens))
