def solution(a, b, flag):
    answer = 0
    
    if flag == 1:
        answer = a + b
    elif flag == 0:
        answer = a - b
        
    return answer