// The question can be found at https://leetcode.com/problems/decode-ways/


class Solution {
private:
    int dp[101];
    int solve(int i, int n, string &s) {
        if(i == n) return 1;
        if(s[i] == '0') return 0;
        if(dp[i] != -1) return dp[i];
        int ans = 0;
        ans += solve(i+1,n,s);
        if(i<n-1 && ((s[i] == '2' && s[i+1] <= '6') || s[i] == '1')) ans += solve(i+2,n,s); 
        dp[i] = ans;
        return dp[i];
    }

public:
    int numDecodings(string s) {
        memset(dp, -1, sizeof(dp));
        if(s[0] == '0') return 0;
        return solve(0, s.length(), s);
    }
};