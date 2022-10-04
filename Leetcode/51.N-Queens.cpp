class Solution {
    bool issafe(int row,int col,vector<string>&board,int n)
    {
        int x=row;
        int y=col;
//         check for row
        while(y>=0)
        {
            if(board[x][y]=='Q')
                return false;
            y--;
        }
//         check for diagonals
        x=row;
        y=col;
        
        while(x>=0 && y>=0)
        {
            if(board[x][y]=='Q')
                return false;
            x--;
            y--;
        }
        
        x=row;
        y=col;
        
        while(x<n && y>=0)
        {
            if(board[x][y]=='Q')
                return false;
            x++;
            y--;
        }
        return true;
    }
    void solve(int col,vector<vector<string>> &ans, vector<string> &board,int n)
    {
//         base case
        if(col==n)
        {
            ans.push_back(board);
            return;
        }
        
        for(int row=0;row<n;row++)
        {
            if(issafe(row,col,board,n))
            {
                board[row][col]='Q';
                solve(col+1,ans,board,n);
                board[row][col]='.';
            }
        }
    }
public:
    vector<vector<string>> solveNQueens(int n) {
        vector<string> board(n);
        string s(n,'.');
        for(int i=0;i<n;i++)
        {
            board[i]=s;
        }
        vector<vector<string>> ans;
        
        solve(0,ans,board,n);
        return ans;
    }
};