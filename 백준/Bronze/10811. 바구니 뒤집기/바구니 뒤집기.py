import sys
input = sys.stdin.readline

n, m = map(int, input().split())

l = [ list(map(int, input().split())) for _ in range(m)]

b = [ i for i in range(1,n+1)]


for i, j in l:

    b[i-1:j]=reversed(b[i-1:j])

for i in b:
    print(i , end=' ')
