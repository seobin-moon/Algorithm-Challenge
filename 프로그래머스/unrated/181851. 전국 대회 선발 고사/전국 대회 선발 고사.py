"""def solution(rank, attendance):
    for i in range len(rank):
        found = rank.index(i)
        print(found)
        if attendance[found] == true:
            final.append(found)
    
    final.sort()"""

def solution(rank, attendance):
    answer = 0
    final = []
    
    for i in range(len(rank)):
        if attendance[i]: # 무슨 뜻이지?
            final.append([rank[i], i]) # final.append('apple')은 알아도 이건 뭐지?
    
    x = final.sort(key = lambda v : v[0]) # 코드 이해 안됨 
    # lambda는 함수를 매우 간단하게 표현 가능!
    # (lambda x,y : x + y)(10, 20)
    
    answer = 10000 * final[0][1] + 100 * final[1][1] + final[2][1]
    return answer 
        
        

    