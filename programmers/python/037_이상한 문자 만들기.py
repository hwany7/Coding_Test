def solution(s):
    res = []

    for s in s.split(' '):
        _str = ''
        for i in range(len(s)):
            if i%2 ==0:
                _str += s[i].upper()
            else:
                _str += s[i].lower()

        res.append(_str)

    return ' '.join(res)
