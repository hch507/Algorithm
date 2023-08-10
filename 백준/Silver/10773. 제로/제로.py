import sys
input = sys.stdin.readline
l=[]
sum=0
m = int(input())
for i in range(m):
    j= int(input())
    if j==0:
        l.pop()
    else:
        l.append(j)

for i in l:
    sum+=i

print(sum)