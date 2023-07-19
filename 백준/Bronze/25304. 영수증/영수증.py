import sys
input = sys.stdin.readline

total = int(input())
kind = int(input())
l = [list(map(int, input().split())) for _ in range(kind)]
sum= 0

for i, j in l:
    sum+=i*j

if(total==sum):
    print("Yes")
else:
    print("No")