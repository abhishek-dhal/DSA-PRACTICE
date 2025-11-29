class Solution {
    public int binSearch(int[] nums,int low,int high,int target){
         
         while(low<=high){
            int mid=low+(high-low)/2;

            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] < target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
         }
         return -1;
    }
    public int search(int[] nums, int target) {
        int n=nums.length;
        if(n == 1 ){
            if(nums[0] == target) return 0;
            else return -1;
        }

        int pivot = -1;

        int i=0;
        int j=1;

        while( i<n-1 && j<n && nums[i] < nums[j]){
            i++;
            j++;
        }
        pivot = i;

        int fHalf = binSearch(nums,0,i,target);
        int sHalf = binSearch(nums,i+1,n-1,target);

        if(fHalf != -1){
            return fHalf;
        }
        if(sHalf != -1){
            return sHalf;
        }
        
      return -1;
    }
}