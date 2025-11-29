class Solution {
    public int fOcuur(int[] nums,int target){
         int n=nums.length;
         int low=0;
         int high=n-1;
         int fIndex=-1;

         while(low<=high){
            int mid=low+(high-low)/2;

            if(nums[mid] == target){
                fIndex=mid;
                high=mid-1;
            }
            else if(nums[mid] < target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
         }
         return fIndex;
    }
    public int lOcuur(int[] nums,int target){
        int n=nums.length;
         int low=0;
         int high=n-1;
         int sIndex=-1;

         while(low<=high){
             int mid=low+(high-low)/2;

            if(nums[mid] == target){
                sIndex=mid;
                low=mid+1;
            }
            else if(nums[mid] < target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
         }
         return sIndex;
    }
    public int[] searchRange(int[] nums, int target) {
        int f = fOcuur(nums,target);
        int l = lOcuur(nums,target);

        int[] ans = new int[2];

        if(f == -1){
            ans[0] = -1;
            ans[1] = -1;
            return ans;
        }

        ans[0] = f;
        ans[1] = l;

        return ans;
    }
}