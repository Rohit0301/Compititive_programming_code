/*
Question Link: https://leetcode.com/problems/paint-house-iii/
*/


class Solution {
public:

    int dp[103][103][103];

    int help(vector<int> &houses, vector<vector<int>> &cost, int m, int n, int target, int i, int prev) {

        if (i == m) {
            if (!target) return 0;
            else return 1e9;
        }

        if (target < 0) return  1e9;

        if (dp[i][prev][target] != -1) return dp[i][prev][target];


        int mn = 1e9;

        // case 1:
        // no need to colorize
        if (houses[i]) {
            if (houses[i] != prev) // nbrs increase, hence target decreases
                return dp[i][prev][target] = help(houses, cost, m, n, target - 1, i + 1, houses[i]);

            else return dp[i][prev][target] = help(houses, cost, m, n, target, i + 1, houses[i]);
        }

        else {

            // case 2: color them

            // I need to paint with colors [1,n] such that the current color isn't the same as the prev
            // if they are the same, nbrs remain the same (no change in target)
            // else, nbrs increase, so target-1

            // colors: 1 to n
            // cost[i][j]: cost to paint ith building with color j+1


            for (int c = 1; c <= n; c++) {
                int cur = cost[i][c - 1];

                if (prev == c) cur += help(houses, cost, m , n, target, i + 1, c);
                else {

                    // explore the rest (next rows)
                    cur += help(houses, cost, m , n, target - 1, i + 1, c);
                }
                mn = min(mn, cur);
            }

            return dp[i][prev][target] = mn;
        }


    }

    int minCost(vector<int>& houses, vector<vector<int>>& cost, int m, int n, int target) {

        memset(dp, -1, sizeof(dp));
        int mm =  help(houses, cost, m, n, target, 0, 0);
        return (mm >= 1e9) ? -1 : mm;
    }
};