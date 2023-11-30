from collections import deque
import sys
T = int(input())

for _ in range(T):
    p = sys.stdin.readline().rstrip() 
    n = int(sys.stdin.readline())
    array_list = deque(sys.stdin.readline().rstrip()[1:-1].split(","))
    if '' in array_list:
        array_list.pop()
    
    reverse_flag = 0
    error_flag = 0

    for cmd in p:
        if cmd == "R":
           reverse_flag += 1
        else:
            if len(array_list) < 1:
                error_flag = 1
                break
            else:
                if reverse_flag % 2 == 0:
                    array_list.popleft()
                else:
                    array_list.pop()
                
    if error_flag == 1:
        print("error")
    else:
        if reverse_flag % 2 == 0:
            print("["+",".join(array_list)+"]")
        else:
            array_list.reverse()
            print("["+",".join(array_list)+"]")
