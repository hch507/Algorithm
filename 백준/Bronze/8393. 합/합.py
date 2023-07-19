import sys

input=sys.stdin.readline

n= int(input())
t=0
for i in range(1, n+1):
    t+=i
print(t)
