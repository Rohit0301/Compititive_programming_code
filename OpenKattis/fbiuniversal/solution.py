UCN = '0123456789ACDEFHJKLMNPRTVWX'
special = {
    'B': '8', 'G':'C','I': '1', 'O': '0', 'Q': '0',
    'S': '5', 'U':'V', 'Y':'V', 'Z':'2'
}
T = int(input())

def to_base_10(base27):
    total = 0
    for ind, el in enumerate(base27[::-1]):
        total += ((27**ind) * UCN.index(el))
    return total

for i_i in range(T):
    K, inp = input().split()
    new_str = ''
    for el in inp[:-1]:
        if el not in UCN:
            new_str += special[el]
        else:
            new_str += el
    mul = 2
    tot = 0
    for el in new_str:
        while mul % 3 == 0:
            mul += 1
        tot += (mul * UCN.index(el))
        mul += 1
    tot %= 27
    if (UCN[tot] == inp[-1]):
        print(K, to_base_10(new_str))
    else:
        print(K, 'Invalid')
