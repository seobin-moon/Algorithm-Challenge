import sys
w, h = map(int, input().split())

w_list = [0, w]
h_list = [0, h]

for _ in range(int(input())):
    direction, number = map(int, sys.stdin.readline().split())
    
    if direction == 1:
        w_list.append(number)
    else:
        h_list.append(number)

w_list.sort()
h_list.sort()

print(max([w_list[i+1] - w_list[i] for i in range(len(w_list)-1)])
    * max([h_list[i+1] - h_list[i] for i in range(len(h_list)-1)]))