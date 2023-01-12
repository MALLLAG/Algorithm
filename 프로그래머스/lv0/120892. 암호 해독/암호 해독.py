def solution(cipher, code):
    result = ''
    count = 0
    
    for i in list(cipher):
        count += 1
        if count % code == 0:
            result += i
    
    return result