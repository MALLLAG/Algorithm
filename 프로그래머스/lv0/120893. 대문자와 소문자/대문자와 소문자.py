def solution(my_string):
    result = []

    for i in list(my_string):
        if i.isupper():
            result.append(i.lower())
        else:
            result.append(i.upper())

    return ''.join(map(str, result))