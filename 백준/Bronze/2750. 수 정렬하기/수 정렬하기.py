import sys
input = sys.stdin.readline

N = int(input()) # 수의 개수를 입력받음
num_list = [] # 숫자들의 리스트를 만듦

for i in range(N):
	num_list.append(int(input())) # N만큼 반복하여 num_list에 항목 추가
num_list1 = sorted(num_list) # num_list를 sorted()를 이용하여 오름차순 정렬 

for i in range(len(num_list)):
	print(num_list1[i]) # num_list1의 요소들을 하나씩 출력