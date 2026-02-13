class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        
        int n = nums.length;

        long sum = 0;

        long maxSum = 0;

        int left = 0;

        Map<Integer,Integer> freq = new HashMap<>();

        for(int right=0;right<n;right++){

             // add new element
             freq.put(nums[right],freq.getOrDefault(nums[right],0)+1);
             sum += nums[right];

             if(right - left + 1 > k){

                freq.put(nums[left],freq.get(nums[left])-1);

                if(freq.get(nums[left]) == 0){
                    freq.remove(nums[left]);

                   
                }
                 sum -= nums[left];
                    left++;

                
             }

             if(right - left + 1 == k && freq.size() == k){
                    maxSum = Math.max(maxSum,sum);
                }

            

        }
         return maxSum;

    }
}