N = int(input())
# list는 앞으로 값이 변동할 수 있다는 것을 보여주고, tuple은 변동할 일이 없음을 보여줌.
dots = [tuple(map(int, input().split())) for _ in range(N)] 
dots = sorted(dots)
for x, y in dots:
	print(x, y)