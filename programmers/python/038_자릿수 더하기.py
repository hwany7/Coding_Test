def solution(n):
    _str = str(n)
    cnt = 0

    for i in range(len(_str)):
        cnt += int(_str[i])

    return cnt
