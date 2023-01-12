def solution(array):
    result = []
    max = 0
    
    for i in array:
        if i > max:
            max = i
    
    result.append(max)
    result.append(array.index(max))
    
    return result