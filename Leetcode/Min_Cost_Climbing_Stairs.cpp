class Solution {
public:
    int dp[1000];
    int rec(int level, int size, vector<int> &cost)
    {
//         this recurrence gives us the minimum cost of reaching the top of the floor
            
//         pruning
        if(level > size)
        {
            return 1001;
//             we will return anything > 999 so that this partial-solution is never chosen
        }
//         base case
        
        if(level == size)
        {
            return 0;
        }
        
        if(dp[level] != -1)
        {
            return dp[level];
        }
        
//      choices
//         choices will be to either take 1 step or two steps
        
        int ans = 0;
        
        ans = cost[level] + min(rec(level + 1, size, cost), rec(level + 2, size, cost));
        
//         return and save
        dp[level] = ans;
        return ans;
    }
    int minCostClimbingStairs(vector<int>& cost) {
        memset(dp, -1, sizeof(dp));
        return min(rec(1, cost.size(), cost), rec(0, cost.size(), cost));   
    }
};