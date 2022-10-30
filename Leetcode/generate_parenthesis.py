
#Description: Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

#Difficulty Level: Medium


class Solution:
    def generateParenthesis(self, n: int) -> List[str]:
        
        stack = []
        res = []
        
        def backtrack(openP, closeP):
            
            if openP == closeP == n:
                res.append("".join(stack))
                return 
            
            if openP > closeP:
                stack.append(")")
                backtrack(openP, closeP + 1)
                stack.pop()
                
            if openP < n:
                stack.append("(")
                backtrack(openP + 1, closeP)
                stack.pop()
                
        backtrack(0, 0)
        return res
