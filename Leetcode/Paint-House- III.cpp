class Solution {
    int dp[101][20][101];
    const int maxi = 1e7;
    
    void find_min(int i, int k, int n, int tmp[]){     
        for(int j = 0; j < n; ++j){
            if(tmp[0] > dp[i][j][k] and dp[i][j][k] != -1){
                tmp[1] = tmp[0];
                tmp[0] = dp[i][j][k];
            }
            else if(tmp[0] <= dp[i][j][k] and tmp[1] > dp[i][j][k])
                tmp[1] = dp[i][j][k];
        }
        
        if(tmp[0] == maxi){
            tmp[0] = -1;
            tmp[1] = -1;
        }
        else if(tmp[1] >= maxi)
            tmp[1] = -1;
    }
    
public:
    int minCost(vector<int>& houses, vector<vector<int>>& cost, int m, int n, int target) {
        memset(dp, -1, sizeof(dp));
        int prev[] = {maxi, maxi + 1};
        int idx = 0;

        if(houses[0] == 0)
            for(int j = 0; j < n; ++j)
                dp[1][j][1] = cost[0][j]; 
        else
            dp[1][houses[0] - 1][1] = 0;
        
        for(int i = 2; i < m + 1; ++i){
            for(int k = 1; k <= i and k < target + 1; ++k){
                find_min(i - 1, k - 1, n, prev);
                
                if(houses[i - 1] == 0){
                    for(int j = 0; j < n; ++j){                        
                        if(prev[0] == dp[i - 1][j][k - 1])
                            idx = 1;
                        else
                            idx = 0;
                         
                        if(prev[idx] != -1 and dp[i - 1][j][k] != -1 and (i + (target - k) <= m))
                            dp[i][j][k] = min(dp[i - 1][j][k], prev[idx]) + cost[i - 1][j];
                        else if(prev[idx] != -1)
                            dp[i][j][k] = prev[idx] + cost[i - 1][j];
                        else if(dp[i - 1][j][k] != -1 and (i + (target - k) <= m))
                            dp[i][j][k] = dp[i - 1][j][k] + cost[i - 1][j];
                        else
                            dp[i][j][k] = -1;
                    }
                }
                else{
                    if(prev[0] == dp[i - 1][houses[i - 1] - 1][k - 1])
                        idx = 1;
                    else
                        idx = 0;
                        
                    if(prev[idx] != -1 and dp[i - 1][houses[i - 1] - 1][k] != -1 and (i + (target - k) <= m))
                        dp[i][houses[i - 1] - 1][k] = min(dp[i - 1][houses[i - 1] - 1][k], prev[idx]);
                    else if(prev[idx] != -1)
                        dp[i][houses[i - 1] - 1][k] = prev[idx];
                    else if(dp[i - 1][houses[i - 1] - 1][k] != -1 and (i + (target - k) <= m))
                        dp[i][houses[i - 1] - 1][k] = dp[i - 1][houses[i - 1] - 1][k];
                    else
                        dp[i][houses[i - 1] - 1][k] = -1;               
                }
                
                prev[0] = maxi;
                prev[1] = maxi + 1;
            }
        }
        
        find_min(m, target, n, prev);
        
        return prev[0];
    }
};
