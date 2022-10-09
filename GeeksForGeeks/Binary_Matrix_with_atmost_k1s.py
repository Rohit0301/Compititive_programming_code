#User function Template for python3


class Solution:
    def largestSquare(self, M, R, C, K, Q, q_i, q_j):
        # code here 
        dp = [[0]*(C+1) for _ in range(R+1)]
        
        for i in range(R):
            for j in range(C):
                dp[i+1][j+1] = M[i][j] + dp[i+1][j] + dp[i][j+1] - dp[i][j]
                
        def sumarea(r2, c2, r1, c1):
            return dp[r2+1][c2+1] - dp[r2+1][c1] - dp[r1][c2+1] + dp[r1][c1]
            
        
        def query(i, j):
            ans = 0
            k = 0
            while True:
                r1, c1 = i-k, j-k
                r2, c2 = i+k, j+k
                if r1 < 0 or r2 >= R or c1 < 0 or c2 >= C:
                    break
                s = sumarea(r2, c2, r1, c1)
                if s > K:
                    break
                ans = 2*k+1
                k += 1
            return ans
            
        return [query(i, j) for i, j in zip(q_i, q_j)]


#{ 
 # Driver Code Starts

if __name__ == '__main__': 
    t = int (input ))
    for _ in range (t):
        R,C=map(int,input().split())
        M=[]
        
        for i in range(R):
            temp=list(map(int,input().split()))
            M.append(temp)
            
        K,Q=list(map(int,input().split()))
        
        q_i=list(map(int,input().split()))
        q_j=list(map(int,input().split()))
        
        ob = Solution()
        res = ob.largestSquare(M,R,C,K,Q,q_i,q_j)
        
        for i in res:
            print(i,end=" ")
        print()
# } Driver Code Ends
