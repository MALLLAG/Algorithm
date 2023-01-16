def solution(n):
    a = []
    for i in range(n):
        if n % (i + 1) == 0:
            a.append(i + 1)
            
    return a