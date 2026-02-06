class Solution {
    public int minRemoval(int[] nums, int k) {

        int n = nums.length;

        Arrays.sort(nums);

        int i = 0;

        int j = 0;

        int L = 1;

         int maxi = nums[0];
         int mini = nums[0];

        while(j < n){
            maxi = nums[j];
            mini = nums[i];

            while(i < j && maxi > (long)k * mini){
                i++;
                mini = nums[i];

            }

            L = Math.max(L,j - i + 1);
            j++;
        }

        return n - L;
        
    }
}