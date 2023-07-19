import sys
input = sys.stdin.readline

n,m,v=map(int, input().split())
total = 0

if(n==m and n==v):
    total = 10000+n*1000

elif(n==m and n!=v):
    total = 1000+n*100

elif(n!=m and m == v):
    total = 1000+m*100

elif(n!=m and n==v):
    total = 1000+n*100

else:
    s=[n,m,v]
    total=max(s)*100

print(total)