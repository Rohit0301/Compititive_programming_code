#include <iostream>
#include <vector>
using namespace std;

int minCostClimbingStairs(vector<int> &cost)
{
    cost.push_back(0);

    for (int i = cost.size() - 3; i >= 0; i--)
    {
        cost[i] += min(cost[i + 1], cost[i + 2]);
    }

    return min(cost[0], cost[1]);
}

int main()
{   
    int size;
    cin >> size;

    vector<int> cost(size);

    for(int index=0; index < size; index++) {
        cin >> cost[index];
    }

    int ans = minCostClimbingStairs(cost);
    cout << ans << endl;

    return 0;
}