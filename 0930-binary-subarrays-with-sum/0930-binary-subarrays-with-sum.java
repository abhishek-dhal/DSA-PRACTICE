class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int n = nums.length;
        long target = goal;
        int cnt=0;
        long currSum = 0;

        HashMap<Long,Integer> psMap = new HashMap<>();

        psMap.put(0L,1);

        for(int i=0;i<n;i++){

            currSum = currSum + nums[i];
            long tarPrefix = currSum - target;

            if(psMap.containsKey(tarPrefix)){
                cnt = cnt + psMap.get(tarPrefix);
            }

            psMap.put(currSum,psMap.getOrDefault(currSum,0)+1);
        }
        return cnt;
    }
}