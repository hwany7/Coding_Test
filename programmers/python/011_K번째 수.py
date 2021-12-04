def solution(array, commands):
    answer = []

    for c in commands:
        # 리스트 자름
        _list = array[c[0]-1:c[1]]

        # 리스트 정렬
        _list.sort()

        # k번째
        answer.append(_list[c[2]-1])

    return answer
