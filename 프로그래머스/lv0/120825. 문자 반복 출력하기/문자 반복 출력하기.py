def solution(my_string, n):
    result = []

    for i in list(my_string):
        for j in range(n):
            result.append(i)

    return ''.join(map(str, result))