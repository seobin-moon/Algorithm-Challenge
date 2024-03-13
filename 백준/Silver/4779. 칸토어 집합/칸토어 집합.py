ans = ['' for _ in range(13)]
ans[0] = '-'

for i in range(1, 13):
	ans[i] = ans[i-1] + (' ' * (3**(i-1))) + ans[i-1]

while True:
	try:
		N = int(input())
		print(ans[N])
	except:
		break

# 규칙을 찾고, 관계식을 세우는 것이 관건!
# bottom-up 방식의 풀이

# f(0) = -
# f(1) = - -
# f(2) = - -   - -
# f(3) = - -   - -         - -   - -

# f(n) = f(n-1) + 공백이 3**(n-1)개 + f(n-1)

# ans[i] : 입력이 i일 때의 답(문자열)
# ans[i] = ans[i-1] + 공백이 3**(i-1)개 + ans[i-1]
# ans[i]가 문자열이기 때문에 python에서는 문자열끼리 덧셈 가능