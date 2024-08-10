n = int(input())
answer = dict()
for i in range(n):
    color = input()
    if color in answer:
        answer[color] += 1
    else:
        answer[color] = 1

print(max(answer.values()))