import sys
N = int(input().rstrip())
white = 0
blue =0
board = [list(map(int,input().rstrip().split())) for _ in range(N)]

def isSame(r,c,size):
    if size ==1:
        return True
    for i in range(r,r+size):
        for j in range(c,c+size):
            if board[i][j] != board[r][c]:
                return False
    return True
    
def dfs(r,c,size):
    global blue, white
    if r>= N or c >=N:
        return
    if isSame(r,c,size) :
        if(board[r][c] ==1):
            blue +=1
        else : 
            white += 1
    else :
        dfs(r,c, size//2)
        dfs(r,c+size//2, size//2)
        dfs(r+size//2,c , size//2)
        dfs(r+size//2, c+size//2, size//2)

dfs(0,0,N)
print(white)
print(blue)
