class Solution {
    // public int m,n;
    //  public int solve(int i,int j,int[][] matrix){
    //    //base case
    //    if(j<0 || j>=n) return Integer.MAX_VALUE;
    //    if(i == m-1) return matrix[i][j];
    //    if(i<0 || i>=m ) return Integer.MAX_VALUE;

    //    int down = solve(i+1,j,matrix);

    //    int left_d = solve(i+1,j-1,matrix);

    //    int right_d = solve(i+1,j+1,matrix);

    //    int minv = Math.min(Math.min(down,left_d),right_d);
 
    //  //if(minv == Integer.MAX_VALUE) return Integer.MAX_VALUE; not required

    //    return matrix[i][j] + minv;
    // }
    public int minFallingPathSum(int[][] matrix) {
    //     m = matrix.length;
    //     n = matrix[0].length;
    //     int ans = Integer.MAX_VALUE;
    //    for(int j=0;j<n;j++){
    //     ans = Math.min(ans,solve(0,j,matrix));
    //    }

    //    return ans;

    //tabulation

         int m = matrix.length;
         int n = matrix[0].length;

          int[][] dp = new int[m][n];

          for(int j=0;j<n;j++){
            dp[0][j] = matrix[0][j];
          }

          for(int i=1;i<m;i++){
            for(int j=0;j<n;j++){
                int down =  dp[i-1][j];
                int left = (j > 0) ?  dp[i-1][j-1] : Integer.MAX_VALUE;
                int right = (j < n-1) ? dp[i-1][j+1] : Integer.MAX_VALUE;

                int minv = Math.min(Math.min(down,left),right);

                dp[i][j] = matrix[i][j] + minv;
            }
          }
          int ans = Integer.MAX_VALUE;
          for(int j=0;j<n;j++){
            ans = Math.min(ans,dp[m-1][j]);
          }
          return ans;
    }
}