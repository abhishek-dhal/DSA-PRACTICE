class Solution {
    public static int m;
    public static int n;
    
    int[][] dir =  {{1,0},{-1,0},{0,1},{0,-1}};

    public boolean find(char[][] board,int i,int j,int ind,String word){
        if(ind == word.length()) return true;
        if(i<0 || j<0 || i>=m || j>=n || board[i][j] == '$') return false;
        if(board[i][j] != word.charAt(ind)) return false;

        char temp = board[i][j];
        board[i][j] = '$';

        for(int[] item:dir){
            int new_i = i + item[0];
            int new_j = j + item[1];

            if(find(board,new_i,new_j,ind+1,word)){
                return true;
            }
        }
        board[i][j] = temp;

        return false;

    }
    public boolean exist(char[][] board, String word) {
        m = board.length;
        n = board[0].length;

        

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j] == word.charAt(0) && find(board,i,j,0,word)){
                    return true;
                }
            }
        }

        return false;
        
    }
}