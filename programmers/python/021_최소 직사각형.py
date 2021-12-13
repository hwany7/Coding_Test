def solution(sizes):

    max_x = max_y = -1

    for x, y in sizes:
        cnt += 1
        if x < y:
            x, y = y, x

        if x > max_x:
            max_x = x

        if y > max_y:
            max_y = y

    return max_x * max_y
