class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1) return 0;
        int n=nums.length;
        int left=0;
        long prod=1;
        int cnt=0;

        for(int right=0;right<n;right++){
            prod=prod*nums[right];
            
            while(prod >= k){
                prod = prod/nums[left];
                left++;
            }

            cnt=cnt+right-left+1;

            
        }

        return cnt;
    }
}