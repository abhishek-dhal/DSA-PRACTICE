class Solution {
    public int m,n;
    // public int solve(int i,int j,List<List<Integer>> triangle){
    //     //base case
    //     if(i == m-1) return triangle.get(i).get(j);
    //     // if(i>m-1) return Integer.MAX_VALUE;
    //     // if(j > n-1) return Integer.MAX_VALUE;  unnecessary

    //     int dir_i = solve(i+1,j,triangle);

    //     int dir_plus = solve(i+1,j+1,triangle);

    //     int minPrev = Math.min(dir_i,dir_plus);
    //     // if(minPrev == Integer.MAX_VALUE) return Integer.MAX_VALUE; //unnecesary as triangle generate valid path only

    //     return triangle.get(i).get(j) + minPrev;
    // }
    public int minimumTotal(List<List<Integer>> triangle) {
        // m = triangle.size();
        // n = triangle.get(m-1).size();

        // return solve(0,0,triangle);


        //tabulation
        int m = triangle.size();
        int[][] dp = new int[m][m];
        int n = triangle.get(m-1).size(); //last row/base size of triangle

        for(int j=0;j<n;j++){
            dp[m-1][j] = triangle.get(m-1).get(j);
        }

        for(int i=m-2;i>=0;i--){
            for(int j=0;j<=i;j++){
              dp[i][j] = triangle.get(i).get(j) + Math.min(dp[i+1][j],dp[i+1][j+1]);
            }
        }

      

        return dp[0][0];
    }
}