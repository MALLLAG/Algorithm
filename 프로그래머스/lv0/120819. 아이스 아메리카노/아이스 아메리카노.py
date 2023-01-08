import math

def solution(money):
    result = []
    if money < 5500:
        result.append(0)
        result.append(money)
    else:
        result.append(math.trunc(money / 5500))
        result.append(money - (math.trunc(money / 5500) * 5500))

    return result