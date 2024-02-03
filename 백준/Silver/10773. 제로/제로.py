import sys
k = int(sys.stdin.readline())
arr = []

for _ in range(k):
    num = int(input()) # 처음에 입력을 받지 않았다.. 큰 실수..

    if num != 0: # arr[i]말고 변수 num 사용
        arr.append(num)

    else:
        arr.pop(-1)

print(sum(arr))


