# 소수 구하기 - 에레토스테네스의 체
def is_prime(num):
    if num == 1:
        return False
    else:
        for i in range(2, int(num ** 0.5) + 1):
            if num % i == 0:
                return False
        return True

t = int(input())

for _ in range(t): 
    n = int(input())
    tmp = n // 2
    
    while tmp > 0:
        if is_prime(tmp):
            if is_prime(n - tmp):
                print(tmp, n-tmp)
                break
        tmp -= 1




# 소수인지 판별하는 알고리즘
# from math import sqrt

# def get divisiors(n):
# 	s = set()
# 	for i in range(1, int(sqrt(n)+1)):
# 		if n % i == 0:
# 			s.add(i)
# 			s.add(n // i)
# 	return s

# def is_prime(n):
# 	return (len(divisiors(n)) == 2)

# print(is_prime(5))


# 에라토스테네스의 체 알고리즘
# import math

# N = 120
# is_prime = [True] * (N+1) # 처음엔 모두 true로 초기화
# is_prime[1] = [False] # 1은 소수가 아니므로

# for i in range(2, int(math.sqrt(N)) + 1):
# 	if not is_prime[i]: continue
# 	for j in range(2*i, N+1, i):
# 		is_prime[j] = False

# for i in range(1, N+1):
# 	print(i, is_prime[i])