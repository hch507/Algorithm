import sys
input = sys.stdin.readline

num1 = int(input())
num2 = int(input())

l=list(map(int,str(num2)))
print(num1*int(l[2]))
print(num1*int(l[1]))
print(num1*int(l[0]))
print(num1*int(num2))
