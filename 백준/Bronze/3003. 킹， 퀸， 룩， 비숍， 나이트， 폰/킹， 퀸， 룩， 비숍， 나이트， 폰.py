import sys
input = sys.stdin.readline

l=[1,1,2,2,2,8]
s=list(map(int, input().split()))

for i in range(6):
    l[i]=l[i]-s[i]
    print(l[i], end=" ")
