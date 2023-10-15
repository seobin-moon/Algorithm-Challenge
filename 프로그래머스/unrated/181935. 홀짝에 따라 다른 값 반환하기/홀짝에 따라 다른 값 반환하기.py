def solution(n):
    answer = 0
    sum = 0
# 초기화 까먹지 않기!
    
    if n > 0 and n % 2 != 0:
        for i in range(1, n+1, 2):
            sum += i
        answer = sum
        
    else:
        for i in range(2, n+1, 2):
            sum += i ** 2 # 또는 제곱이기 때문에 i * i도 가능
        answer = sum
            
    return answer

# 제곱근은 m ** n의 형태로 표기함
# i ** i는 제곱근이 아님. ex) 4의 제곱이 아닌 4의 4제곱을 구하는 셈.
