def solution(n, k):
    p = 0

    if n >= 10:
        p = n // 10

    return (n * 12000) + ((k - p) * 2000)