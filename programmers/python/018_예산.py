def solution(d, budget):
    cnt = 0

    for x in sorted(d):
        if budget-x > 0:
            cnt += 1
            budget -= x
        elif budget-x == 0:
            cnt += 1
            break
        else:
            break

    return cnt
