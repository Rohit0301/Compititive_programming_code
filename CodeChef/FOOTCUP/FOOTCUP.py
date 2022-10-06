#Read no.of testcases
t=int(input())
for l in range(t):
    #Read X and Y — the goals scored by each team.
    x,y=map(int,input().split())
    #Chef likes a match if:
    #The match ends in a draw and
    #At least one goal has been scored by either team.
    
    #We check goals x and y are equal so as match to end in draw as well 
    #min(x,y)must be greater or equal to than 1
    #(atleast 1 goal has been scored by either team)
    
    if min(x,y)>=1 and x==y:
        print("YES")
    else:
        print("NO")