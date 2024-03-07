import sys
input = sys.stdin.readline

N = int(input())
arr = []

for i in range(N):
	"""
	arr.append()를 사용하여 원소를 추가하지 않고, arr = int(input())라고만 해서 
	TypeError: 'int' object is not iterable 라는 에러가 남
	""" 
	arr.append(int(input()))
result = (sorted(arr))

for i in range(len(result)):
	print(result[i])