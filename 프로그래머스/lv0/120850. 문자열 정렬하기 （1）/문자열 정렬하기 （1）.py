def solution(my_string):
    result = []

    for i in list(my_string):
        if i.isdigit():
            result.append(int(i))

    result.sort()
    return result