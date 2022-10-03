
// Solution 1 - Backtracking Approach (C++)

class Solution {
public:
    int totalNQueens(int n) {
	vector<vector<bool>> board(n, vector<bool>(n, false));
	return solve(board, 0);
    }
    bool isSafe(vector<vector<bool>>& board, int row, int col) {
	    int n = size(board);
	    for(int i = 0; i <= row; i++) {
			// checking if any queen already placed on same column previously
		    if(board[i][col]) return false; 
		    // checking if all diagonals are safe -
		    if(row - i >= 0 && col - i >= 0 && board[row - i][col - i]) return false;
		    if(row - i >= 0 && col + i <  n && board[row - i][col + i]) return false;
	    }
	    return true;
    }    
    int solve(vector<vector<bool>>& board, int row) {
	    if(row == size(board)) return 1;
	    int count = 0;
	    for(int col = 0; col < size(board); col++)           
		    if(isSafe(board, row, col)){          // check if we can place at (row, col)
			    board[row][col] = true;          // place the queen at (row, col)
			    count += solve(board, row + 1);  // explore for the next row. The function will return 1 if all N queens get placed for current combination
				// backtrack - remove previously placed queen and try for different columns
			    board[row][col] = false;         
		    }                                
	    return count;
    }
};



// Time Complexity : O(N!)
// Space Complexity: O(N*N)



// Solution 2 - (Backtracking Approach O(N) Space)


int totalNQueens(int n) {
	vector<bool> col(n), diag(2*n-1), anti_diag(2*n-1);
	return solve(col, diag, anti_diag, 0);
}
   
int solve(vector<bool>& col, vector<bool>& diag, vector<bool>& anti_diag, int row) {
	int n = size(col), count = 0;
    if(row == n) return 1;
	for(int column = 0; column < n; column++)           
		if(!col[column] && !diag[row + column] && !anti_diag[row - column + n - 1]){        // check if (row, column) is safe
			col[column] = diag[row + column] = anti_diag[row - column + n - 1] = true;      // place at (row, column)
			count += solve(col, diag, anti_diag, row + 1);                                  // explore for the next row
			col[column] = diag[row + column] = anti_diag[row - column + n - 1] = false;     // backtrack
		}                                
	return count;
}



// Time Complexity : O(N!)
// Space Complexity : O(N)





