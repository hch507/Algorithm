import sys
input =sys.stdin.readline

n, m = map(int, input().split())

am = 0
if( m-45 < 0):
    n=n-1
    am=60-45+m
    if(n<0):
        n=23
else:
    am=m-45
print(n, am)
