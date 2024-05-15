T = int(input())

for tc in range(1, T+1):
    N, Q = map(int, input().split())

    box = [0] * (N+1)
    for i in range(1, Q+1):
        L, R = map(int, input().split())
        for j in range(L, R+1): # 범위 조심! 하는 것보다 애초에 box의 인덱스를 하나 더 많게 선언해서 안쓰면 됨
            box[j] = i

    print(f'#{tc}', *box[1:]) # box[0]은 사용하지 않기 때문에 1번 인덱스부터 출력!