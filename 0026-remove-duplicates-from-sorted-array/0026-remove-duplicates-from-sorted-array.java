class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if(n == 0) return 0;
        
        // i Pointer pointing to position of unique element

        // i ---> unique j -----> check pointer or read pointer
        int i = 1;
        
        for(int j=1;j<n;j++){

            if(nums[j] != nums[i-1]){
                nums[i] = nums[j];

                i++;
            }
        }

        return i;
    }
}