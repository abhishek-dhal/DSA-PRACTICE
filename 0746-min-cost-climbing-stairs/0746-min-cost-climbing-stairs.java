class Solution {
    // public int solve(int ind,int[] cost,int[] dp){
    //    if(ind <= 1) return cost[ind];

    //    if(dp[ind] != -1) return dp[ind];
        

    //     int left = cost[ind] + solve(ind-1,cost,dp);

    //     int right = cost[ind] + solve(ind-2,cost,dp);

    //     return dp[ind] =Math.min(left,right);
    // }
    public int minCostClimbingStairs(int[] cost) {
        // int n = cost.length;
        // int[] dp = new int[n+1];
        // Arrays.fill(dp,-1);
        // return Math.min(solve(n-1,cost,dp),solve(n-2,cost,dp));

        //tabulation
        int n = cost.length;
        int[] dp = new int[n+1];

        dp[0] = cost[0];
        dp[1] = cost[1];

        for(int i=2;i<n;i++){
            dp[i] = cost[i] +  Math.min(dp[i-1],dp[i-2]);
        }

        return Math.min(dp[n-2],dp[n-1]);
    }
}