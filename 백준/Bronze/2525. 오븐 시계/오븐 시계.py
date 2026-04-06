import sys
input=sys.stdin.readline

n, m = map(int, input().split())
t= int(input())


if(m+t>=60):
    u=(m+t)//60
    n= n+u
    m=(m+t)%60
    if(n>=24):
        n=n-24
else:
    m=m+t

print(n, m)