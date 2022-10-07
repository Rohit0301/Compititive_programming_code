class Solution {
public:
    void rotate(vector<vector<int>>& matrix) {
        int trans,r=matrix.size();
        int c=matrix[0].size();
        int v[r][c];
        
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                   v[i][j]=matrix[r-1-j][i]; 
            }
        }
        cout<<matrix[r-1][0];
       for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                   matrix[i][j]=v[i][j]; 
            }
        } 
    }
};
