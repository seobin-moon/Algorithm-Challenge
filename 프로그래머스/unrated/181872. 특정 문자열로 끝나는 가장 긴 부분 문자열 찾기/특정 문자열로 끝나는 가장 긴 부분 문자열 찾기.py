def solution(myString, pat):
    last_index = myString.rfind(pat)
    
    if (last_index != "\0"):
        answer = myString[:last_index + len(pat)]
    
    return answer
        