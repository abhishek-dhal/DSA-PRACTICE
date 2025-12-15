class Solution {
    public int n;

    // public int solve(int ind,int end,int[] nums){
    //     if(ind > end) return 0;

    //     //rob 
    //     int rob = nums[ind] + solve(ind+2,end,nums);

    //     //skip
    //     int skip = solve(ind+1,end,nums);

    //     return Math.max(rob,skip);
    // }
    public int rob(int[] nums) {
        // n = nums.length;

        // int case1 = solve(0,n-2,nums);

        // int case2 = solve(1,n-1,nums);

        // return Math.max(case1,case2);

    
    //second approach
    n = nums.length;

    if(n == 1) return nums[0];
    if(n == 2) return Math.max(nums[0],nums[1]);

    int case1 = findTotal(0,n-2,nums);

    int case2 = findTotal(1,n-1,nums);

    return Math.max(case1,case2);
        

       
    }

    public int findTotal(int start,int end,int[] nums){
        int len = end-start+1;
        int[] dp = new int[len+1];

        dp[0] = 0;
        dp[1] = nums[start];

        for(int i=2;i<=len;i++){
            int rob = nums[start+i-1] + dp[i-2];

            int skip = dp[i-1];

            dp[i] = Math.max(rob,skip);
        }

        return dp[len];
    }
}