class Solution {
    // public int solve(int i,int j,int[][] grid){
    //     //base case
    //     if(i == 0 && j == 0) return grid[0][0];

    //     if(i < 0 || j < 0) return Integer.MAX_VALUE;//out of boundary dont pick so set very very large value

        
    //      int up = solve(i-1,j,grid);
    //      int left = solve(i,j-1,grid);

    //      int minPrev =  Math.min(up,left);



    //    if(minPrev == Integer.MAX_VALUE) return Integer.MAX_VALUE ;
       
    //    return grid[i][j] + minPrev;

    // }
    public int minPathSum(int[][] grid) {
        // int m = grid.length;
        // int n = grid[0].length;

        // return solve(m-1,n-1,grid);

        //tabulation

        int m = grid.length;
        int n = grid[0].length;

        int[][] dp = new int[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i == 0 && j == 0){
                    dp[i][j] = grid[i][j];
                }
                else if(i == 0){ //first row
                    dp[i][j] = grid[i][j] + dp[i][j-1];
                }
                 else if(j == 0){ //first column
                    dp[i][j] = grid[i][j] + dp[i-1][j];
                }
                else{
                    int up = dp[i-1][j];
                    int left =dp[i][j-1];

                    dp[i][j] =  grid[i][j] +  Math.min(up,left);
                }
            }
        }

        return dp[m-1][n-1];
    }
}