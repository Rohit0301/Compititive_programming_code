class Solution {
public:
    vector<vector<int>> transpose(vector<vector<int>>& matrix) {
        vector<vector<int>> v(matrix[0].size(),vector<int> (matrix.size()));
        for(int i=0;i<matrix.size();i++){
            for(int j=0;j<matrix[i].size();j++){
                v[j][i]=matrix[i][j];
            }
        }
        return v;
    }
};