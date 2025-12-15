class Solution {
    public int n;
    // public int solve(int ind,int[] nums){

    //     if(ind >= n){
    //         return 0;
    //     }
    //     //rob
    //     int one  = nums[ind] + solve(ind+2,nums);
    //     //skip
    //     int two = solve(ind+1,nums);

    //     return Math.max(one,two);
    // }
    public int rob(int[] nums) {
        n = nums.length;

        // return solve(0,nums);



        //tabulation

        //edge case
        if(n == 1) return nums[0];
        if(n == 2) return Math.max(nums[0],nums[1]);




        int[] dp = new int[n+1];

        dp[0] = nums[0];

        dp[1] = Math.max(nums[0],nums[1]);

        for(int i=2;i<n;i++){
            int rob = nums[i] + dp[i-2];
            int skip = dp[i-1];

            dp[i] = Math.max(rob,skip);
        }

        return dp[n-1];
        
    }
}