def solution(my_string):
    a = ['a', 'e', 'i', 'o', 'u']
    result = []

    for i in list(my_string):
        if i not in a:
            result.append(i)

    return ''.join(map(str, result))