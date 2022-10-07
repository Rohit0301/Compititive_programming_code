class Solution {
public:
    vector<vector<string>> ans;
    bool isSafe(vector<string> &board, int row, int col) {
        // row
        for(int j = 0; j < board.size(); j++) {
            if(board[row][j] == 'Q') {
                return false;
            }
        }
        
        // column
        for(int j = 0; j < board.size(); j++) {
            if(board[j][col] == 'Q') {
                return false;
            }
        }
        
        // diagonals
        for(int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if(board[i][j] == 'Q') {
                return false;
            }
        }
        
        for(int i = row - 1, j = col + 1; i >= 0 && j < board.size(); i--, j++) {
            if(board[i][j] == 'Q') {
                return false;
            }
        }
        
        return true;
    }
    
    void sol(int row,vector<string>& s){
        if(row==s.size()){
            ans.push_back(s);
            return;
        }
        for(int col=0 ; col<s.size();col++){
            if(isSafe(s,row,col)){
                s[row][col] = 'Q';
                sol(row+1,s);
                s[row][col] = '.';
            }
        }
        
    }
    vector<vector<string>> solveNQueens(int n) {
        
        vector<string> s;
        string t(n,'.');
        for(int i=0;i<n;i++)
            s.push_back(t);
       sol(0,s);
        return ans;
    }
};
