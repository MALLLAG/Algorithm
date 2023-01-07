def solution(n):
    a = 0
    
    for i in range(n):
        if (i + 1) % 2 == 0:
            a += i+1
            
    return a