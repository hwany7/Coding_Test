def solution(price, money, count):

    _sum = sum([n*price for n in range(1, count+1)])

    return _sum - money if _sum > money else 0
