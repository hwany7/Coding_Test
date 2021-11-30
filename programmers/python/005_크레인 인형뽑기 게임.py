import collections

def solution(board, moves):
    cnt = 0
    dq = collections.deque()

    for m in moves:
        for i in range(len(board)):
            if board[i][m-1] != 0:

                #인형 집어서 옮기기
                dq.append(board[i][m-1])
                board[i][m-1] = 0

                #같은 인형 반복 삭제
                while len(dq)>=2 and dq[-1] == dq[-2]:
                    print(dq)
                    dq.pop(), dq.pop()
                    cnt += 1
                break

    return cnt * 2
