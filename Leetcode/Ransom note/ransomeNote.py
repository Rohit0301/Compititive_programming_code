class Solution(object):
    def canConstruct(self, ransomNote, magazine):
        
        
        for i in set(ransomNote):
            if ransomNote.count(i) > magazine.count(i):
                return False
        return True
