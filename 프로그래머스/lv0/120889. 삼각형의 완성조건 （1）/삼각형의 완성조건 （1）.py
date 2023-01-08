def solution(sides):
    max = 0

    for i in sides:
        if i > max:
            max = i

    sides.remove(max)

    if max < sum(sides):
        return 1
    else:
        return 2