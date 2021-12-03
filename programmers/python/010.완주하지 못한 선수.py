import collections

def solution(participant, completion):

    # 카운터
    _dict = collections.Counter(participant)

    for c in completion:
        # 완주자 디카운트
        _dict[c] -= 1

        # 사전에서 삭제
        if _dict[c] == 0:
            del _dict[c]

    answer = list(_dict.keys())[0]
    return answer


# 카운터 객체 끼리는 빼기가 가능하다
# 같은 값이 있으면 del을 진행

def solution_2(participant, completion):
    answer = collections.Counter(participant) - collections.Counter(completion)
    return list(answer.keys())[0]
