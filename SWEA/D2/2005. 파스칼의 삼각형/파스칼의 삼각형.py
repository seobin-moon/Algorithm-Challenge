T = int(input())

for tc in range(1, T+1):
	N = int(input())
	print(f'#{tc}')
	ans = []

	for i in range(N):
		res = [1] * (i+1)

		if i >= 2:
			for j in range(1, i):
				res[j] = ans[i-1][j-1] + ans[i-1][j]

		ans.append(res)
		print(*res)