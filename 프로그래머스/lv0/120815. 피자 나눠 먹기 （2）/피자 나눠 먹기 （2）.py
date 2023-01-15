def solution(n):
    a = 1
    while True:
        if (6 * a) % n == 0:
            return a
        else:
            a += 1