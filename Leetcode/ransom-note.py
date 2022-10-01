class Solution(object):
    def canConstruct(self, ransomNote, magazine):
        """
        :type ransomNote: str
        :type magazine: str
        :rtype: bool
        """
        if len(magazine) < len(ransomNote):
			return False
        else:

			for ransomNote_char in set(ransomNote):

				if ransomNote.count(ransomNote_char) > magazine.count(ransomNote_char):
					return False

			return True
        
