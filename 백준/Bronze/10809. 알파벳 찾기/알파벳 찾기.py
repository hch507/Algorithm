import sys
input = sys.stdin.readline

n = input().rstrip()
s= 'abcdefghijklmnopqrstuvwxyz'
for i in s:
    if i in n:
        print(n.index(i), end =' ')
    else:
        print(-1, end=' ')