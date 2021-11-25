def solution(lottos, win_nums):
    answer = []
    hit_cnt, zero_cnt = 0, 0
    dic = {6:1, 5:2, 4:3, 3:4, 2:5, 1:6, 0:6}

    #히트체크
    for i in lottos:
        if i == 0:
            zero_cnt += 1
        elif i in win_nums:
            hit_cnt += 1

    #최고순위
    cnt = hit_cnt + zero_cnt
    answer += [dic[cnt]]

    #최저순위
    answer += [dic[hit_cnt]]

    return answer
