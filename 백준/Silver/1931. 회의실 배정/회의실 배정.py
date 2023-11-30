n = int(input())
schedule = []

for _ in range(n):
  schedule.append(list(map(int, input().split())))

schedule = sorted(schedule, key= lambda x: x[0])
schedule = sorted(schedule, key= lambda x: x[1])

ans = 1
end_time = schedule[0][1]

for i in range(1, n):
  if end_time <= schedule[i][0]:
    end_time = schedule[i][1]
    ans += 1

print(ans)