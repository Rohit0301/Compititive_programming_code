# problem:  https://codeforces.com/contest/1393/problem/B

def check(tem2, tem4):
    if(tem4 < 1):
        return False
    if(tem4 >= 2):
        return True
    if(tem2 >= 4):
        return True
    return False
    
 
num = int(input())
init = input().split()
dic = {}
tem4 = 0
tem2 = 0
resultado = []
 
for i in init:
    if i in dic:
        tem4 -= int(dic[i]/4)
        tem2 -= int(dic[i]/2)
        dic[i] += 1
        tem4 += int(dic[i]/4)
        tem2 += int(dic[i]/2)
    else:
        dic[i] = 1
 
num = int(input())
for i in range(num):
    a, b = input().split()
    if(a == "+"):
        if b in dic:
            tem4 -= int(dic[b]/4)
            tem2 -= int(dic[b]/2)
            dic[b] += 1
            tem4 += int(dic[b]/4)
            tem2 += int(dic[b]/2)
        else:
            dic[b] = 1
    else:
        tem4 -= int(dic[b]/4)
        tem2 -= int(dic[b]/2)
        dic[b] -= 1
        tem4 += int(dic[b]/4)
        tem2 += int(dic[b]/2)
        
    if(check(tem2, tem4)):
        resultado.append("YES")
    else:
        resultado.append("NO")
 
print("\n".join(resultado))