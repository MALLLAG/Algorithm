def solution(my_string):
    result = []
    for i in list(my_string):
        if i not in result:
            result.append(i)
            
    return ''.join(result)