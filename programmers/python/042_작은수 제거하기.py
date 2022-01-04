import sys

def solution(arr):

    if len(arr) < 2: return [-1]

    min = sys.maxsize
    pos = 0

    for index, num in enumerate(arr):
        if min > num:
            min = num
            pos = index

    return arr[:pos] + arr[pos+1:]
