def solution(num, k):
    l = list(map(int, str(num)))
    if l.count(k) != 0:
        return l.index(k) + 1
    else:
        return -1