import sys
input=sys.stdin.readline


l=[]

for i in range(1, 10):
    a = int(input())
    l.append(a)

print(max(l))
print(l.index(max(l))+1)

