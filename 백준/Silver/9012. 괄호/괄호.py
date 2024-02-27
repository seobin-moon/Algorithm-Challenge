import sys

input = sys.stdin.readline
t = int(input())

for i in range(t): # t(testcase)만큼 반복
	s = [] # 비어 있는 리스트 's' 생성
	bracket = input() # 입력받은 문자열 '(' ,')' 저장
	
	for j in bracket: # 입력받은 문자열의 문자를 하나하나씩 반복
		if j == '(': # '('일 경우
			s.append(j) # s에 현재 문자 추가

		elif j == ')': # ')'일 경우
			if len(s) != 0: # s가 비어있지 않다면 
				s.pop() # s에서 마지막에 추가된 '(' 제거
			else: 
				print("NO") 
				break

		else: # for 루프가 정상 종료됐다면, s가 비어있는지 확인
			if len(s) == 0:
				print("YES")
			else:
				print("NO")
                