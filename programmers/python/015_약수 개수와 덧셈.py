def solution(left, right):
    sum = 0

    for x in range(left, right+1):
        cnt = 0

        # 약수인지 체크
        for i in range(1, x+1):
            if x%i == 0:
                cnt += 1

        # 문제의 조건에 따라 합차
        if cnt%2 == 0:
            sum += x
        else:
            sum -= x

    return sum
