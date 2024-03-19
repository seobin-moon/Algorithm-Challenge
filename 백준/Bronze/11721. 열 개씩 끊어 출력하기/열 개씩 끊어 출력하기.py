N = input()

for i in range(0, len(N), 10): # 반복문을 10씩 증가. 반드시 시작하는 범위 0과 끝 범위인 len(N)을 적어야 함.
	print(N[i:i+10]) # N 문자열을 10단위로 끊어서 출력