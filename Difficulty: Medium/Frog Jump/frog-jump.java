class Solution {
    // public int solve(int ind,int[] height){
        
    //     //base case
    //     if(ind == 0) return 0;
        
        
    //     //i+1 jump
    //     int first = Math.abs(height[ind]-height[ind-1]) + solve(ind-1,height);
        
    //     int second = Integer.MAX_VALUE;
    //     //i+2 jump
    //     if(ind > 1){
    //         second = Math.abs(height[ind]-height[ind-2]) + solve(ind-2,height);
    //     }
        
    //     return Math.min(first,second);
    // }
    int minCost(int[] height) {
        // int n = height.length;
        // return solve(n-1,height);
        
        
        //tabulation
        int n = height.length;
        
         if(n == 1) return 0;
        
        int[] dp = new int[n+1];
        
        dp[0] = 0;
        dp[1] = Math.abs(height[1] - height[0]);
        
        for(int i=2;i<n;i++){
           int oneJump = dp[i-1] + Math.abs(height[i] - height[i-1]);
           int secondJump = dp[i-2] + Math.abs(height[i] - height[i-2]);
           
           dp[i] = Math.min(oneJump,secondJump);
        }
        
       
        return dp[n-1];
        
    }
}