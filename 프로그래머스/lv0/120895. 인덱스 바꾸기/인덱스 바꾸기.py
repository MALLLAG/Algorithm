def solution(my_string, num1, num2):
    l = list(my_string)
    a = l[num1]
    b = l[num2]
    l[num1] = b
    l[num2] = a

    s = ''
    for i in l:
        s += i
    return s