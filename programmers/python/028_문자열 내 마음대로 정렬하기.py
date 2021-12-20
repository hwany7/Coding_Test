def solution(strings, n):
    # 다중 정렬
    strings.sort(key= lambda x : (x[n], x))
    return strings
