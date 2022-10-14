l = []
for i in range(int(input())):
     l.append(input())
if l == sorted(l):
    print("INCREASING")
elif l == sorted(l , reverse=True):
    print("DECREASING")
else:
    print("NEITHER")
    
    