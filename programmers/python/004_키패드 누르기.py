def button_distance(btn1, btn2, pad):
    return abs(pad[btn1][0] - pad[btn2][0]) + abs(pad[btn1][1] - pad[btn2][1])

def solution(numbers, hand):
    l, r, answer = '*', '#', ''
    pad = {
        1: [0, 0], 2: [0, 1], 3: [0, 2],
        4: [1, 0], 5: [1, 1], 6: [1, 2],
        7: [2, 0], 8: [2, 1], 9: [2, 2],
        '*': [3, 0], 0: [3, 1], '#': [3, 2]
    }

    for number in numbers:
        if pad[number][1] == 0:
            answer += 'L'
            l = number
        elif pad[number][1] == 2:
            answer += 'R'
            r = number
        else:
            left_dis = button_distance(l, number, pad)
            right_dis = button_distance(r, number, pad)

            if left_dis < right_dis:
                answer += 'L'
                l = number
            elif left_dis > right_dis:
                answer += 'R'
                r = number
            else:
                if hand == "left":
                    answer += 'L'
                    l = number
                else:
                    answer += 'R'
                    r = number
    return answer
