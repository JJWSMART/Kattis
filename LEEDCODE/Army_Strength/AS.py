#!/usr/env/bin python3
import sys

def army_strength(testcase):
    for i in range(testcase):
        lt = []
        for i in range(4):
            line = sys.stdin.readline().rstrip()
            if line == "": continue
            lt.append(line)
        a, b = map(int, lt[0].split(" "))
        Godzilla = map(int, lt[1].split(" "))
        MechaGodzilla = map(int, lt[2].split(" "))
        Godzilla.sort()
        MechaGodzilla.sort()
        x, y = 0,0
        while x < len(Godzilla) and y < len(MechaGodzilla):
            if Godzilla[x] < MechaGodzilla[y]: x += 1
            else: y += 1
        #meaning of question
        if x == len(Godzilla): print ("MechaGodzilla")
        else: print ("Godzilla")

if __name__ == '__main__':
    testcase = int(sys.stdin.readline().rstrip())
    army_strength(testcase)
