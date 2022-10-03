class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        # use a dict to store the occurences
        char_occurences = {}        
        
        for char in s:
            if char not in char_occurences.keys():
                char_occurences[char] = 1
                continue
            char_occurences[char] = char_occurences[char] + 1
            
        for char in t:
            if char not in char_occurences.keys():
                return False
            char_occurences[char] = char_occurences[char]-1
            
        for key, value in char_occurences.items():
            if value != 0:
                return False
        return True
