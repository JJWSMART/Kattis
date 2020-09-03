#!/usr/env/bin python
# -*- coding: utf-8 -*-

import sys

ANSWER_COUNT = 0
MAXNUM = 8

def check(x, y, chess):



def find_queen8(x, chess):
    global ANSWER_COUNT, MAXNUM
    chess_tmp = [[0 for col in range(MAXNUM)] for row in range(MAXNUM)]

    for i in range(MAXNUM):
        for j in range(MAXNUM):
            chess_tmp[i][j] == chess[i][j]

    if x == MAXNUM:
        ANSWER_COUNT = ANSWER_COUNT + 1
        print_chess(chess_tmp)
        return

    for i in range(MAXNUM):
        if(check(x, i, chess_tmp)):
            chess_tmp[x][i] = 1
            find_queen8(x+1, chess_tmp)
            chess_tmp[x][i] = 0


if __name__ == "__main__":
    #初始棋盘
    chess = [[0 for col in range(MAXNUM)] for row in range(MAXNUM)]
    #从第0行开始
    find_queen8(0, chess)
    #打印结果
    print('求解{}皇后问题，共有{}个答案: '.format(MAXNUM, ANSWER_COUNT))

