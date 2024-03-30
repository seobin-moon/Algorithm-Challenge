from math import sqrt

# 에라토스테네스의 체
def is_prime(num):
    if num == 1:
        return False
    else:
        for i in range(2, int(sqrt(num))+1): # 또는 int(num**0.5)
            if num % i == 0: 
                return False # 소수 아님
        return True # 소수 맞음 

t = int(input())

for _ in range(t): 
    n = int(input())
    tmp = n//2
    
    while tmp > 0:
        if is_prime(tmp):
            if is_prime(n-tmp): # (n - (n//2)) 값도 소수인지 확인
                print(tmp, n-tmp)
                break
        tmp -= 1