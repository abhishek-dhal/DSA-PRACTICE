class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        int left=0;
        long sum=0;
        double avg=0;
        double maxAvg = Integer.MIN_VALUE;

        for(int right=0;right<n;right++){
            sum=sum+nums[right];


            while(right-left+1 > k){
                sum=sum-nums[left];
                left++;
            }

            if(right-left+1 == k){
                avg=(double)sum/k;
                 maxAvg = Math.max(maxAvg,avg);

            }

           
        }
        return maxAvg;
        
    }
}