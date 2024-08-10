n = int(input())
answer = dict()

for i in range(n):
    color = input()
    answer[color] = answer.get(color, 0) + 1

print(max(answer.values()))