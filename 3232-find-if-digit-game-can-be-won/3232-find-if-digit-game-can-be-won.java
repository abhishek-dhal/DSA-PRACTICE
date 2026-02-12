class Solution {
    public boolean canAliceWin(int[] nums) {
        
        int n = nums.length;

        int single_sum = 0;

        int double_sum = 0;

        int total_sum = 0;

       

        for(int i=0;i<n;i++){

            if(nums[i] < 10) {
                single_sum += nums[i];
            }

            else{
                double_sum += nums[i];
            }

            total_sum += nums[i];


        }

        if(single_sum > total_sum/2) return true;

        if(double_sum > total_sum/2) return true;


        return false;
 

    }
}