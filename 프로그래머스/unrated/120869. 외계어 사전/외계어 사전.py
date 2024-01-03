def solution(spell, dic):
    for i in dic:
        if not set(spell) - set(i):
            return 1
    return 2

# set의 특징
# 중복을 허용하지x, 순서x