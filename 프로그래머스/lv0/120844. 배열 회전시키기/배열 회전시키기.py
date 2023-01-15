def solution(numbers, direction):
    if direction == 'right':
        i = numbers.pop(-1)
        numbers.insert(0, i)
    else:
        i = numbers.pop(0)
        numbers.append(i)
        
    return numbers