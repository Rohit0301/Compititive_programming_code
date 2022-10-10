

# Written by : Dhruv_Vavliya

# just think about 4,5,6 --length arrays 
def self_crossing(x):
    for i in range(3,len(x)):

        if x[i-3]>=x[i-1] and x[i]>=x[i-2]:
            return True
        
        if i>=4:
            if x[i-3] == x[i-1] and x[i-2]<=(x[i-4]+x[i]):
                return True

        if i>=5:
            if x[i-2]>=x[i-4] and x[i-3]>=x[i-1] and (x[i-5]+x[i-1])>=x[i-3] and (x[i-4]+x[i])>=x[i-2]:
                return True

    return False