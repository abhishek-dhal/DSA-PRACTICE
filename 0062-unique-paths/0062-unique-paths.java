class Solution {
    // public int solve(int i,int j,int m,int n){
    //     //base case
    //     if(i == m-1 && j == n-1){
    //         return 1;
    //     }
    //     if(i >m-1 || j>n-1) return 0;

    //     int right = solve(i,j+1,m,n);
    //     int bottom = solve(i+1,j,m,n);

    //     return right+bottom;
    // }
    public int uniquePaths(int m, int n) {
        // return solve(0,0,m,n);

        //tabulation
        int[][] dp = new int[m][n];

        dp[0][0] = 1;
        for(int i=0;i<m;i++) dp[i][0] = 1;
        for(int j=0;j<n;j++) dp[0][j] = 1;

        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                int up = dp[i-1][j];
                int left = dp[i][j-1];
                dp[i][j] = up + left;
            }
        }

        return dp[m-1][n-1];
    }
}