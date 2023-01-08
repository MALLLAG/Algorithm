def solution(s1, s2):
    count = 0
    
    for i in s1:
        for j in s2:
            if j == i:
                count += 1
    
    return count
                