class Solution {
    // public int n;
    // public boolean checkSum(int ind,long t,int[] nums,long targetSum){

    //     //base case
    //     if(t == targetSum) return true;

    //     if(t > targetSum) return false;

    //     if(ind == n)  return false;

    //     //take
       
    //     if(checkSum(ind+1,t + nums[ind],nums,targetSum)) return true;
    //     //donot take

    //    return checkSum(ind+1,t,nums,targetSum) ;
    // }
    public boolean canPartition(int[] nums) {
        //  n = nums.length;

        // long sum = 0;
        // for(int i=0;i<n;i++){
        //     sum = sum + nums[i];
        // }

        // if(sum % 2 != 0) return false;

        // long targetSum = sum / 2;

        // return checkSum(0,0L,nums,targetSum);

        

        //tabular approach

         int n = nums.length;

         long sum = 0;

         for(int num : nums){
            sum += num;
         }

         long target = sum / 2;

         if(sum % 2 != 0) return false;

         int val = (int)target;



        boolean[][] dp = new boolean[n+1][val+1];

        for(int i=0;i<=n;i++){
            dp[i][0] = true;
        }

        for(int i=1;i<=n;i++){
            for(int s = 1;s <= val;s++){

                //not take
                dp[i][s] = dp[i-1][s];

                //take
                if(s >= nums[i-1]){
                    dp[i][s] = dp[i][s] || dp[i-1][s-nums[i-1]];
                }
            }
        }

        return dp[n][val];
    }
}