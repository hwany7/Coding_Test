def solution(nums):
    answer = 0

    _len = len(nums)/2
    _set = set(x for x in nums)

    if _len >= len(_set):
        answer = len(_set)
    else:
        answer = _len

    return answer
