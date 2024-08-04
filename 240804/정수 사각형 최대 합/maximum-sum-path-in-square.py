N = int(input())
arr = [list(map(int, input().split())) for _ in range(N)]
dp = [[0 for _ in range(N)] for _ in range(N)]

def initialize(arr, dp):
    dp[0][0] = arr[0][0]
    # 첫줄 가로 초기화
    for i in range(1, N):
        dp[0][i] = dp[0][i - 1] + arr[0][i]
    # 첫줄 세로 초기화
    for j in range(1, N):
        dp[j][0] = dp[j - 1][0] + arr[j][0]
    return dp

dp = initialize(arr, dp)

for r in range(1, N):
    for c in range(1, N):
        dp[r][c] = max(dp[r][c - 1] + arr[r][c], dp[r - 1][c] + arr[r][c])

print(max(dp[N - 1]))