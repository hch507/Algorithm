import sys
input = sys.stdin.readline

num1 = []
num2 = []
t = 1

while(t):
    n, m =map(int, input().split())
    if n ==0 and m== 0:
        t =0
    else:
        num1.append(n)
        num2.append(m)

for j in range(len(num2)):
     print(num1[j]+num2[j])

