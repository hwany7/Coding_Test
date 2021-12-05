def solution(n, lost, reserve):

    # 학생번호: index + 1
    _list = [1 for x in range(n)]

    # 잃어버린 학생
    for l in lost:
        _list[l-1] -= 1

    # 여벌 학생
    for r in reserve:
        _list[r-1] += 1

    # 연산
    for i in range(len(_list)):
        # 왼쪽 확인
        if _list[i]==0 and i!=0 and _list[i-1]==2:
            _list[i-1] -= 1
            _list[i] += 1

        #오른쪽 확인
        if _list[i]==0 and i!=len(_list)-1 and _list[i+1]==2:
            _list[i+1] -= 1
            _list[i] += 1

    return len(_list) - _list.count(0)
