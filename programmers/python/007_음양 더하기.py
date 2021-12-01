def solution(absolutes, signs):
    sum = 0

    for abs, sig in zip(absolutes, signs):
        if sig:
            sum += abs
        else:
            sum -= abs

    return sum
