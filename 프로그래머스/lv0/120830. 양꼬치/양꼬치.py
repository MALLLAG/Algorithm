def solution(n, k):
    plus = 0

    if n >= 10:
        plus = n // 10

    return (n * 12000) + ((k - plus) * 2000)