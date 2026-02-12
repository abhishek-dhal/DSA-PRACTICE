class Solution {

    public int findSumDigit(int num){

        int sum = 0;

        while(num != 0){

            int d = num % 10;

             sum += d;

            num = num / 10;
        }

        return sum;
    }
    public int differenceOfSum(int[] nums) {

        int n = nums.length;

        int element_sum = 0;

        int digit_sum = 0;

        for(int i = 0; i < n; i++){

            element_sum += nums[i];

            digit_sum += findSumDigit(nums[i]);
        }

        return Math.abs(element_sum - digit_sum);
        
    }
}