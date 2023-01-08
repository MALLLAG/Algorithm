def solution(n):
    if n // 7 <= 1:
        return 1
    elif n // 7 > 1:
        if n % 7 == 0:
            return (n // 7)
        else:
            return (n // 7) + 1