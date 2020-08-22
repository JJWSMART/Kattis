class StockSpanner(object):

    def __init__(self):
        self.s_ = []
        
    def next(self, price):
        span = 1
        while len(self.s_) != 0 and price >= self.s_[-1][0]:
            span += self.s_[-1][1]
            self.s_.pop()
        self.s_.append([price, span])
        return span
