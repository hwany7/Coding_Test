import itertools, math

def solution(nums):

    #리스트 조합 생성
    _list = itertools.permutations(nums, 3)

    #조합의 합의 집합 생성
    _set = set(sum(x) for x in  _list)

    cnt = 0
    for x in _set:
        if isPrime(x):
            cnt += 1

    return cnt

#소수판별
def isPrime(x):
    for i in range(2, int(math.sqrt(x))+1):
        if x % i == 0:
            return False
    return True
