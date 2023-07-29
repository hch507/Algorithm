import sys
input = sys.stdin.readline

l= [list(map(str, input().rstrip())) for i in range(5)]

for j in range(15):
    for i in range(5):
        if(j<len(l[i])):
            print(l[i][j], end='')
    
