class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;

       
        int low=0;
        int high=n-1;

        while(low < high){
            int mid = low + (high-low)/2;

            if(nums[mid] < nums[mid+1]){
                //we are on upward peak can be on right half
                low=mid+1;
            }
            else if(nums[mid] > nums[mid+1]){
                //mid might be peak or ans can be on left half
                high=mid;
            }
        }

        return low;

    }
}