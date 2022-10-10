class Solution:
	def coinChange(self, coins: List[int], amount: int) -> int:
		MAX=float('inf')
		dp=[0]+[MAX for i in range(amount)]
		for i in range(1,amount+1):
			for c in coins:
				if i-c>=0:
					dp[i]=min(dp[i],dp[i-c])
			dp[i]+=1
		if dp[-1]==MAX:
			return -1
		else:
			return dp[-1]