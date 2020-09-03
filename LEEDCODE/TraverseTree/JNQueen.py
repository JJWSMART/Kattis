#!/usr/env/bin python3
import sys

maxnum = 8
cnt = 0


def check(x,y,chess):
    for i in range(x):
        if(chess[i][y] == 1):
                return False
        if(y-1-i >= 0):
            if (chess[x-1-i][y-1-i] == 1):
                return False
        if(y+1+i < maxnum):
            if (chess[x-1-i][y+1+i] == 1):
                return False
    return True

def eight_queen(rowx, chess):
    global cnt, maxnum
    chess_tmp = [[0 for col in range(maxnum)] for row in range(maxnum)]
    for i in range(maxnum):
        for j in range(maxnum):
            chess_tmp[i][j] = chess[i][j]
    if(rowx == maxnum):
        cnt += 1
        print("cnt : ", cnt)
        return

    for i in range(maxnum):
        if(check(rowx, i, chess_tmp)):
            chess_tmp[rowx][i] = 1
            eight_queen(rowx+1, chess_tmp)
            chess_tmp[rowx][i] = 0

def main():
    chess = [[0 for col in range(maxnum)] for row in range(maxnum)]
    eight_queen(0, chess)
    print('求解{}皇后问题，共有{}个答案: '.format(maxnum, cnt))

if __name__ == "__main__":
    main()
