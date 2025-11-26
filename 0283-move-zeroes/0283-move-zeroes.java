class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;

        int write=0;

        for(int read=0;read<n;read++){
            if(nums[read] != 0){
                nums[write] = nums[read];
                write++;
            }
        }

        for(int i=write;i<n;i++){
            nums[i] = 0;
        }
    }
}