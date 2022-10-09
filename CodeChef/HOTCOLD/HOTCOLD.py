#Read Number of testcases
tc=int(input())
for l in range(t):
    #Read temperature c:
    #We check if c>20 then we say climate is hot otherwise cold respectively as per Chefs consideration
    c=int(input())
    if c>20:
        print("HOT")
    else:
        print("COLD")