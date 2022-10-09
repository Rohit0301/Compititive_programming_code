class Solution {
public:
    vector<int> countPoints(vector<vector<int>>& points, vector<vector<int>>& queries) {
        vector<int> res(queries.size(), 0);
        for (int j = 0; j < queries.size(); j++)
            res[j] = getPointsInside(queries[j], points);
        return res;
    }
private:
    int getPointsInside(const vector<int>& query, const vector<vector<int>>& points) {
        int res = 0, x = query[0], y = query[1], r = query[2];
        for (int i = 0; i < points.size(); i++) {
            int dx = abs(x - points[i][0]), dy = abs(y - points[i][1]);
            if (dx == 0 && dy == 0 || sqrt(dx * dx + dy * dy) <= r)
                res++;
        }
        return res;
    }
};
