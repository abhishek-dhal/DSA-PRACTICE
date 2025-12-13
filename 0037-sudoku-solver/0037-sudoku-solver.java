class Solution {
    private int m,n;

    public boolean isValid(int row,int col,char[][] board,char d){
        for(int i=0;i<9;i++){
            if(board[row][i] == d ){
                return false;
            }
            if(board[i][col] == d){
                return false;
            }
        }

        int new_row = row/3 * 3;
        int new_col = col/3 * 3;
        
        for(int k=0;k<3;k++){
            for(int l=0;l<3;l++){
                if(board[new_row+k][new_col+l] == d){
                    return false;
                }
            }
        }

        return true;
    }

    public boolean solve(char[][] board){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j] == '.'){

                    for(char d = '1';d<= '9';d++){
                        if(isValid(i,j,board,d)){
                            board[i][j] = d;
                            if(solve(board) == true){
                                return true;
                            }

                            board[i][j] = '.'; 
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
   
    public void solveSudoku(char[][] board) {
        m = board.length;
        n = board[0].length;
        solve(board);
        
        return;
    }
}