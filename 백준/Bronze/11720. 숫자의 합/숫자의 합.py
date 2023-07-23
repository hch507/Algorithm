import sys
input = sys.stdin.readline

n = int(input())
l= list(map(int, input().rstrip()))
sum=0
for i in l:
    sum+=i

print(sum)