import sys
 
num_of_stairs = int(input())
stairs = []
for _ in range(num_of_stairs):
    stairs.append(int(sys.stdin.readline().strip()))
 
dp = [[0,0] for _ in range(num_of_stairs+1)]
 
if num_of_stairs == 1:
    print(stairs[0])
else:
    for i in range(1, num_of_stairs+1):
        dp[i][0] = stairs[i-1] + dp[i-1][1] 
        dp[i][1] = stairs[i-1] + max(dp[i-2]) 
    print(max(dp[num_of_stairs]))