def solution(n):
    _list = list(str(n))
    _list.reverse()
    return list(map(int, _list))
