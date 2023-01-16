from math import factorial

def solution(n):
    a = 10
    while n < factorial(a):
        a -= 1

    return a