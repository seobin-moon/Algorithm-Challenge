def solution(number, n, m):
    answer = 0
    
    if number % n == 0 and number % m == 0:
        answer = 1
        
    else:
        answer = 0
        
    return answer

# 'and' 대신 &연산자를 넣으면 테스트 하나에서 에러가 발생했음
# 'and'는 boolean형에 기반한 연산에 쓰이고, &는 integer를 기반한 연산에 쓰임
#  and는 논리 AND 연산자임. 두 개의 조건식이 모두 True일 때, True를 리턴
# &는 비트 연산자이며, 두 개의 이진수에서 동일한 위치의 bit가 1인 것들만 1로 계산
# 이 문제에서는 계산이 목적이 아닌, 두 개의 조건식이 모두 true일 때를 판별하기 위한 것이므로
# 'and' 연산자를 쓰는 것이 맞음
