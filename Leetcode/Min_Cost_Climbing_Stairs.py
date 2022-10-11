class Solution:
    def minCostClimbingStairs(self, cost: List[int]) -> int:
        prev2, prev1 = 0, 0
        for i in range(2, len(cost) + 1):
            curr = min(prev2 + cost[i - 2], prev1 + cost[i - 1])
            prev2, prev1 = prev1, curr
        return prev1
