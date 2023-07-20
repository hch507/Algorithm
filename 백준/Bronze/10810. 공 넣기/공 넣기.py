import sys
input=sys.stdin.readline

n, m = map(int, input().split())
l=[list(map(int, input().split())) for _ in range(m)]
s=[[0] for _ in range(n)]


for i,j,k in l:
    for v in range(i-1,j):
        s[v].append(k)


for i in range(n):
    print(s[i][-1], end=" ")
