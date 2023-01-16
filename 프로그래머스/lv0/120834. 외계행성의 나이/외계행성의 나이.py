def solution(age):
    result = ''
    a = {'a': 0, 'b': 1, 'c': 2, 'd': 3, 'e': 4, 'f': 5, 'g': 6, 'h': 7, 'i': 8, 'j': 9}
    for i in list(map(int, str(age))):
        for key, value in a.items():
            if value == i:
                result += key

    return result