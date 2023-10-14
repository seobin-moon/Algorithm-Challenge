def solution(a, b):
    answer = 0
    A = int(str(a) + str(b))
    B = int(str(b) + str(a))
    
    if A >= B:
        answer = A
    else:
        answer = B
        
    return answer

# 1) 숫자를 문자로 인식한 후 2) 각 문자를 더하고 3) 문자를 다시 숫자로 형변환하기
# 그리고 두 숫자를 비교하여 a+b와 b+a 중 더 큰 숫자의 합으로 출력하기