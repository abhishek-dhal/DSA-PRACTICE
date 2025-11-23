class Solution {
    public int maxFrequency(int[] nums, int k) {
        int n=nums.length;

        Arrays.sort(nums);

        long total=0;
        int left=0;
        int maxFreq=0;

        for(int right=0;right<n;right++){
            total=total+nums[right];

            long target=nums[right];
            long windowSize=right-left+1;
            long idealSum = target*windowSize;
            long numNeed = idealSum - total;

            while(numNeed > k){
                total=total-nums[left];
                left++;

                windowSize = right-left+1;
                idealSum = target*windowSize;
                numNeed = idealSum - total;
            }

            maxFreq = Math.max(maxFreq,(int)windowSize);
        }


        return maxFreq;

       

    }
}