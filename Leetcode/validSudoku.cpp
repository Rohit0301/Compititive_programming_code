class Solution {
public:
    bool isValid(vector<vector<char>>& board, char val, int i, int j){
	  //check row and column occurence in one loop.
        for(int k=0; k<9; k++){
            if(board[i][k] == val && k!=j) return false;
            if(board[k][j] == val && k!=i) return false;
        }
		// check within their corresponding box
        int start_i = i/3, start_j=j/3; 
        start_i *= 3; start_j *= 3;
        for(int k=start_i; k<start_i+3; k++){
            for(int l=start_j; l<start_j+3; l++){
                if(board[k][l]==val && k!=i && l!=j) return false;
            }   
        }
        return true;
    }
    bool isValidSudoku(vector<vector<char>>& board) {
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                if(board[i][j]!='.' && !isValid(board, board[i][j],  i, j)) return false;
            }
        }
        return true;
    }
};
