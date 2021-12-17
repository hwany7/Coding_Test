def solution(s):
    if len(s) % 2 == 0:
        center = len(s) // 2
        return s[center-1:center + 1]

    else:
        center = len(s) // 2
        return s[center]
