import sys
input = sys.stdin.readline

n = int(input())
l= [list(map(str, input().split())) for i in range(n)]

for i,j in l:
    a=''
    for v in j:
        a= a+(v*int(i))
    print(a)