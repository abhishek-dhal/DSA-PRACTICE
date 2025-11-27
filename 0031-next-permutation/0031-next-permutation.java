class Solution {
    public void reverseA(int[] nums,int left,int right){
        while(left < right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }

    public void swap(int[] nums,int left,int right){
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int ind = -1;

        //Find the break point  or pivot,ind
       

       //Backword loop
        for(int i=n-2;i>=0;i--){

            if(nums[i] < nums[i+1]){
                ind = i;
                break;
            }
        }

        //Edge Case if no pivot present
        if(ind == -1){
            reverseA(nums,0,n-1);
            return;
            
        }

        //Find the el to swap
        for(int i=n-1;i>ind;i--){
            if(nums[i] > nums[ind]){
                swap(nums,ind,i);
                break;
            }
        }

        //After swapping reverse from ind+1 ---> n-1
        reverseA(nums,ind+1,n-1);


        

    }
}