class Solution {
    public long findMaxi(int[] nums){
        long largest = nums[0];

        for(int num:nums){
            if(num > largest){
                largest = num;
            }
        }
        return largest;
    }
    public long findDivSum(long d,int[] nums,long t){
        long sum=0;
        for(long num:nums){
            sum += ((long)num+d-1)/d;
        }
        return sum;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int n = nums.length;
        long t = threshold;
        

        //Edge case
        if(n == 1) {
            long div = nums[0];
            long result = nums[0] /div;
            if(div < t){
                return (int)result;
            }
        }

        long low=1;
        long high = findMaxi(nums);
        long ans = -1;

        while(low <= high){

            long mid = low + (high-low)/2;

            long result = findDivSum(mid,nums,t);
            if(result <= t){
                ans = mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }

        return (int)ans;
        
    }
}