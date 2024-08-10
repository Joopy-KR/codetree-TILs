n, m = map(int, input().split())
words = dict()
numbers = dict()

for i in range(1, n + 1):
    word = input()
    words[word] = i
    numbers[i] = word

for j in range(m):
    cmd = input()
    if cmd.isdigit():
        print(numbers[int(cmd)])
    else:
        print(words[cmd])