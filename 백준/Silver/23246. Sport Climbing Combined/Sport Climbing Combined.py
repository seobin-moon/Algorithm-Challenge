n = int(input())
infos = [list(map(int, input().split())) for _ in range(n)]

# 곱, 합, 등번호 순으로 앞서기 
infos = sorted(infos, key=lambda x : (x[1] * x[2] * x[3], x[1] + x[2] + x[3], x[0]))

for b, p, q, r in infos[:3]:
	print(b, end=' ')