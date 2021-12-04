def solution(answers):

    # [학생번호, 맞은개수] 의 list
    _list = [[x, 0] for x in range(1, 4)]

    # 답안 패턴
    a = [1, 2, 3, 4, 5]
    b = [2, 1, 2, 3, 2, 4, 2, 5]
    c = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5]

    # 점수, index = 학생번호
    scores = [0, 0, 0]

    # 결과
    result = []

    # 단안 채점
    for i, answer in enumerate(answers):
        if answer == a[i % len(a)]:
            scores[0] += 1

        if answer == b[i % len(b)]:
            scores[1] += 1

        if answer == c[i % len(c)]:
            scores[2] += 1

    # 최고 점수
    max_socre = max(scores)

    # index가 학생 번호랑 동일(오름차순), 따로 정렬할 필요 없다
    for i, score in enumerate(scores):
        if score == max_socre:
            result += [i+1]

    return result
