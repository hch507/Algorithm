import sys
input = sys.stdin.readline

num1 = []
num2 = []
while True:
    try:
        n,m = map(int, input().split())
        num1.append(n)
        num2.append(m)
    except:
        break

for j in range(len(num2)):
      print(num1[j]+num2[j])