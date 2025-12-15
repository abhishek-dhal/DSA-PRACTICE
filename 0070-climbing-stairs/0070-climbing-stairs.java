class Solution {
    public int[] dp;
    // public int solve(int ind){
    //     if(ind == 0) return dp[ind] = 1;
    //     if(ind == 1) return dp[ind] = 1;

    //     if(dp[ind] != -1) return dp[ind];

    //     int left = solve(ind-1);
    //     int right = solve(ind-2);

    //     return dp[ind] = left+right;
    // }
    public int climbStairs(int n) {
        // dp = new int[n+1];
        // Arrays.fill(dp,-1);
        // int m = n;
        // return solve(m);

        //tabulation
        dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;

        for(int i=2;i<=n;i++){
            dp[i] = dp[i-1]+dp[i-2];
        }

        return dp[n];
    }
}