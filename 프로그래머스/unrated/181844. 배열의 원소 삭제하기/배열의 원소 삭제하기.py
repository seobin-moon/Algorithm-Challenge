def solution(arr, delete_list):
    for i in delete_list:
        if i in arr:
            arr.remove(i)
    return arr

"""def solution(arr, delete_list):
    return [i for i in arr if i not in delete_list]"""

# 리스트명.remove('값')는 하나의 원소만 제거 가능
# 여러 개의 원소를 제거하고자 할 때는 list comprehension 이용