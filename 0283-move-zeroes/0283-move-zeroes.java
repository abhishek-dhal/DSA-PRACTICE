class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;

        //read ----> for scanning the array
        //write ----> position of non-zero element

        int write=0;
       
       //First we place the non-zero el in order from 0 ----> (write -1)
        for(int read=0;read<n;read++){
            if(nums[read] != 0){
                nums[write] = nums[read];
                write++;
            }
        }
       
       //we handle or place the zero at last from write ---> n-1;
        for(int i=write;i<n;i++){
            nums[i] = 0;
        }
    }
}