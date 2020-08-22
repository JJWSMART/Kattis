#!/usr/env/bin python
import sys
class StockSpanner(object):

    def __init__(self):
        self.stock = []
        self.priceArr = []
        self.i_ = 0
        
    def next(self, price):
        if self.i_ == 0 or price < self.priceArr[-1]: 
            self.stock.append(1)
        else:
            j = self.i_ - 1
            while j >= 0 and price >= self.priceArr[j]: 
                j -= self.stock[j]
            self.stock.append(self.i_ - j)
        self.i_+= 1
        self.priceArr.append(price)
        return self.stock[-1]

