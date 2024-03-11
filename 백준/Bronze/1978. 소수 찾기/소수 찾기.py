import sys
from math import sqrt

# 에라토스테네스의 체 알고리즘

def is_prime(x):
  if x < 2: 
  	return False
  for i in range(2, int(sqrt(x))+1):
    if x % i == 0:
      return False
  return True

N = int(input())
PN = list(map(int, sys.stdin.readline().split()))

cnt = 0
for i in PN: 
  if is_prime(i):
    cnt +=1
    
print(cnt)



'''
N = int(input())

is_prime = [True] * (N + 1) # 처음에는 모두 true로 초기화
is_prime[1] = False # 1은 소수가 아니므로

# 에라토스테네스의 체 알고리즘

for i in range(2, int(math.sqrt(N)) + 1):
	if not is_prime[i]: continue
	for j in range(2 * i, N + 1, i):
		is_prime[j] = False

for i in range(1, N + 1):
	print(i, is_prime[i])
'''