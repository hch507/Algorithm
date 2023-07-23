import sys
input = sys.stdin.readline


n =int(input())
l=[list(map(str,input().rstrip()))for _ in range(n)]

for i in range(n):
   print( l[i][0]+l[i][-1])
