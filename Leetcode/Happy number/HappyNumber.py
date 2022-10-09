class Solution:
    def isHappy(self, n):  
        sum_sq = 0
        possibles = [1, 10, 100, 1000]
        while sum_sq not in possibles:
          new_n = [int(i)**2 for i in str(n)]
          sum_sq = sum(new_n)
          n = sum_sq
          if n == 145:
            return False
        else:
          return True
