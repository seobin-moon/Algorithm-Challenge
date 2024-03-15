vows = ['a', 'e', 'i', 'o', 'u']
choose = []


def is_possible():
	global L, C, choose, arr

	vow = 0
	for c in choose:
		vow += (c in vows)
	con = L - vow

	return (vow >= 1 and con >= 2)

def combination(idx, lev):
	global L, C, choose, arr

	# base case
	if lev == L:
		if is_possible():
			print(''.join(choose)) # 배열 choose를 문자열로 바꾸는 작업
		return

	# recursive case
	for i in range(idx, C):
		choose.append(arr[i])
		combination(i + 1, lev + 1)
		choose.pop()


L, C = map(int, input().split()) # 변수에 값을 한번에 할당하는 것: 언패킹
arr = input().split()

arr.sort()

combination(0, 0)