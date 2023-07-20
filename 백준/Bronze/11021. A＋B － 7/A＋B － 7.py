import sys

input=sys.stdin.readline

n= int(input())

l=[list(map(int, input().split())) for _ in range(n)]
cnt=1
for i, j in l:
    sum = i+j
    print(f'Case #{cnt}: {sum}')
    cnt+=1
