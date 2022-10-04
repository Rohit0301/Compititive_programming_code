class Solution:
    def isHappy(self, n: int) -> bool:
        seen_sums = set()
        sum = n
        
        while sum != 1:     
            sum = 0
            for char in str(n):
                num = int(char)
                sum = sum + num * num 
                
            # cycle detected
            if sum in seen_sums:
                return False
            
            seen_sums.add(sum)
            n = sum
        
        return True
