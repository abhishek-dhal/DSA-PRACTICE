class Solution {
    public boolean fHalf(int[] nums,int low,int high,int x){
        while(low<=high){
            int mid = low + (high - low)/2;

            if(nums[mid] == x){
                return true;
            }
            else if(nums[mid] < x){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return false;
    }
    
    public boolean search(int[] nums, int target) {
        int n=nums.length;
        
        if(n == 1){
            if(nums[0] == target) return true;
            else return false;
        }

        int i=0;
        int j=1;
        int pivot = -1;

        while(i<n-1 && j<n && nums[i] <= nums[j]){
            i++;
            j++;
        }
        pivot = i;
        
        boolean f = fHalf(nums,0,i,target);
        boolean s = fHalf(nums,j,n-1,target);

        if(f == false && s == false){
            return false;
        }
       

        return true;
    }
}