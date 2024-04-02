n = int(input())
fac = 1

for i in range(n, 0, -1): # n부터 1까지 내림차순
	fac *= i

print(fac)