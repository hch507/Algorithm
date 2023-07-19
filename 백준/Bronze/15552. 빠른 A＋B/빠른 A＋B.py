import sys
input= sys.stdin.readline

t = int(input())
num1 = []
num2 = []
for i in range(t):
    n, m = map(int, input().split())
    num1.append(n)
    num2.append(m)

for j in range(t):
    print(num1[j]+num2[j])