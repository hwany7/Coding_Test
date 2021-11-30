def solution(numbers):
    sum = 0

    #list to set
    _set = (numbers)

    #check
    for i in range(10):
        if not i in _set:
            sum += i

    return sum
