def solution(before, after):
    b = list(before)
    a = list(after)
    b.sort()
    a.sort()

    if a == b:
        return 1
    else:
        return 0