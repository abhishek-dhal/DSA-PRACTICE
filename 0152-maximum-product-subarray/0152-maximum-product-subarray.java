class Solution {
    public int maxProduct(int[] nums) {
        // all +ve
        // even -ve
        //odd -ve
        // has zeros
        //if encounter zero restart as zero shouldnot be included in the subarray
        //the -ve separe the array into prefix and suffix
        //between two which is greater is max

        int n = nums.length;

        int prefix = 1; //from front side
        int suffix = 1; //from back side

        int maxP = Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(prefix == 0) prefix = 1;
            if(suffix == 0) suffix = 1;

            prefix = prefix * nums[i];
            suffix = suffix * nums[n-i-1];

            maxP = Math.max(maxP,Math.max(prefix,suffix));

         }

         return maxP;
    }
}