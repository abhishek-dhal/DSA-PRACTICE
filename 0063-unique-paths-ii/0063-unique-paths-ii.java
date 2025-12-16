class Solution {
    public int m,n;

    // public int solve(int i,int j,int[][] obstacleGrid){
    //     //base case
    //     if(i == 0 && j == 0) return 1;
    //     if(i<0 || j<0) return 0;
    //     if(obstacleGrid[i][j] == 1) return 0;

    //     int left = solve(i-1,j,obstacleGrid);

    //     int up = solve(i,j-1,obstacleGrid);

    //     return left+up;
    // }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        // m = obstacleGrid.length;
        // n = obstacleGrid[0].length;

        // return solve(m-1,n-1,obstacleGrid);


        //tabulation

        m = obstacleGrid.length;
        n = obstacleGrid[0].length;

        if(obstacleGrid[0][0] == 1) return 0;

        int[][] dp = new int[m][n];
        
      
        dp[0][0] = 1;

        
        //first row ----> If an obstacle appears → everything after it is 0
        //first column ----> If an obstacle appears → everything below it is 0


        //first row
        for(int j=1;j<n;j++){
            if(obstacleGrid[0][j] == 1){
                dp[0][j] = 0;
            }
            else{
                dp[0][j] = dp[0][j-1];
            }
        }
        //first column
        for(int i=1;i<m;i++){
            if(obstacleGrid[i][0] == 1){
                dp[i][0] = 0;
            }
            else{
                dp[i][0] = dp[i-1][0];
            }
        }
        



        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(obstacleGrid[i][j] == 1) dp[i][j] = 0;

               else{
                 int left = dp[i-1][j];
                int up = dp[i][j-1];

                dp[i][j] = left+up;
               }
            }
        }
        return dp[m-1][n-1];
    }
}