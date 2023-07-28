import sys
input = sys.stdin.readline

l= [list(map(int, input().split())) for i in range(9)]
x=0
y=0
max=-1
for i in range(9):
    for j in range(9):
        if (l[i][j]>max):
            max=l[i][j]
            x=i+1
            y=j+1

print(max)
print(x, y)