#!/usr/env/bin python
import sys

def virus(s1, s2):
    while s1[0] == s2[0] and len(s1) and len(s2):
        s1 = s1[1:]
        s2 = s2[1:]
    while s1[len(s1)-1] == s2[len(s2)-1] and len(s1) and len(s2):
        s1 = s1[:len(s1)-1]
        s2 = s2[:len(s2)-1]
    print len(s2)
if __name__ == "__main__":
    str1 = sys.stdin.readline().rstrip()
    str2 = sys.stdin.readline().rstrip()
    virus(str1, str2)
