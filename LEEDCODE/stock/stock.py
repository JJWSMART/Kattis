#!usr/env/bin python
import sys

class StockSpanner(object):

    def __init__(self):
        self.stack = []
    
    def next(self, price):
        self.stack.append(price)
        if len(self.stack) == 1: return 1
        else:
            tnum = 1
            for i in range(len(self.stack)-2, -1, -1): 
                if price >= self.stack[i]: 
                    tnum += 1
                else: 
                    return tnum
            return tnum
        return 0

obj = StockSpanner()
price = ""
param_1 = obj.next(price)
