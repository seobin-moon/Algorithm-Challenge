"""def solution(num_str):
    answer = 0
    for num in num_str:
        answer += int(num)
    return answer"""

def solution(num_str):
    return sum(map(int, num_str))
    