def solution(num_list, n):
    answer = []
    for i in range(len(num_list) // n):
        answer.append(num_list[0:n])
        del num_list[0:n]

    return answer