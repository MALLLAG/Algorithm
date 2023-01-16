def solution(n):
    result = 0

    for i in range(n):
        a = 0
        for j in range(i + 1):
            if (i + 1) % (j + 1) == 0:
                a += 1
        if a >= 3:
            result += 1

    return result