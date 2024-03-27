import math

A, B, V = map(int, input().split()) # 여러 개의 값을 한꺼번에(한 줄에) 입력
# 올라가야 할 거리 = V-B
# 하루에 갈 수 있는 거리 = A-B
day = (V-B) / (A-B)
print(math.ceil(day)) # ceil 함수를 이용해서 반올림
