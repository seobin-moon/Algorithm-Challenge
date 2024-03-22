def solution(friends, gifts):
    
    # 친구 정보 초기화
    friends_info = dict()
    for me in friends:
        friends_info[me] = dict()
        friends_info[me]['GIVE'] = 0
        friends_info[me]['RECEIVE'] = 0
        for you in friends:
            if me == you:
                continue
            friends_info[me][you] = 0
            
    # 선물 기록 돌면서 카운트 올리기
    for gift in gifts:
        giver, receiver = gift.split()
        friends_info[giver][receiver] += 1
        friends_info[giver]['GIVE'] += 1
        friends_info[receiver]['RECEIVE'] += 1
    
    # 선물 누가 받을지 최종 계산
    answer = [0 for _ in range(len(friends))]
    
    for i in range(len(friends)):
        for j in range(i+1, len(friends)):
            me = friends[i]
            you = friends[j]
            
            if friends_info[me][you] > friends_info[you][me]:
                answer[i] += 1
            elif friends_info[me][you] < friends_info[you][me]:
                answer[j] += 1
            else:
                my_score = friends_info[me]['GIVE'] - friends_info[me]['RECEIVE']
                your_score = friends_info[you]['GIVE'] - friends_info[you]['RECEIVE']
                if my_score > your_score:
                    answer[i] += 1
                elif my_score < your_score:
                    answer[j] += 1
                    
    return max(answer)
        