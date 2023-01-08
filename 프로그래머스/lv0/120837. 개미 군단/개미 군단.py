def solution(hp):
    a = 5
    b = 3
    c = 1
    count = 0

    count += hp // a
    hp = hp % a

    count += hp // b
    hp = hp % b

    count += hp // c

    return count