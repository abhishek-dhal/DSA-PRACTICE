class Solution {
    public int findAtMostk(int[] nums,int k){
        int n = nums.length;

        int cnt_odd = 0;

        int left = 0;

        int ans = 0;

        for(int right = 0;right<n;right++){
            if(nums[right] % 2 != 0) cnt_odd++;

            while(cnt_odd > k){
                if(nums[left] % 2 != 0) cnt_odd--;

                left++;
            }

            // All subarrays ending at 'right' and starting from [left..right] are valid
            // Number of such subarrays = right - left + 1

            ans = ans + right - left + 1;
        }
        return ans;
    }
    public int numberOfSubarrays(int[] nums, int k) {
        
        // Problem: count subarrays with EXACTLY k odd numbers
        // Key idea: counting "exactly k" directly is hard
        // Trick: exactly(k) = atMost(k) - atMost(k-1)
         // Convert odd -> 1, even -> 0 and use sliding window

        return findAtMostk(nums,k) - findAtMostk(nums,k-1);
    }
}