class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;

        int cnt=0;
        int maxLen = 0;

        for(int i=0;i<n;i++){
            if(nums[i] == 1){
                cnt++;
            }
            else{
                maxLen = Math.max(maxLen,cnt);

                cnt=0;
            }
        }

        maxLen = Math.max(maxLen,cnt);

        return maxLen;
    }
}