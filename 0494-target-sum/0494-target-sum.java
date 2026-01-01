class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int n = nums.length;

        int totalSum = 0;
        for(int num: nums){
            totalSum += num;
        }

         // If impossible to split
        if(Math.abs(target) > totalSum) return 0;
        if((totalSum + target) % 2 != 0) return 0;

        int requiredSum = (totalSum + target) / 2;

        // dp[s] = number of ways to get sum s
        int[] dp = new int[requiredSum + 1];
        dp[0] = 1;

        for(int num : nums){
            // Traverse backwards to avoid reuse
            for(int s = requiredSum; s>=num;s--){
                dp[s] += dp[s-num];
            }
        }

        return dp[requiredSum];
    }
}