class Solution:
    def findDuplicate(self, nums: List[int]) -> int:
        occurences = {}
        
        for num in nums:
            if num in occurences.keys():
                return num
            occurences[num] = 1
