import sys
input = sys.stdin.readline

n = int(input())
sum=0
l=list(map(int, input().split()))
s=[]
a=0
sum=0

for i in l:

    a= i/max(l)*100
    sum=sum+a

print(sum/n)