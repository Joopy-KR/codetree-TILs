n, m = map(int, input().split())
arr = list(map(int, input().split()))
questions = list(map(int, input().split()))
cnt_dct = dict()

for i in range(n):
    if arr[i] in cnt_dct:
        cnt_dct[arr[i]] += 1
    else:
        cnt_dct[arr[i]] = 1

for j in range(m):
    answer = cnt_dct.get(questions[j], 0)
    print(answer, end=" ")