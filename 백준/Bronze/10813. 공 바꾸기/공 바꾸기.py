import sys
input=sys.stdin.readline

n, m = map(int, input().split())
l=[list(map(int, input().split())) for _ in range(m)]
s=[i+1 for i in range(n)]
c = 0

for i,j in l:
    c=s[i-1]
    s[i-1]=s[j-1]
    s[j-1]=c

for i in s:
    print(i, end=" ")