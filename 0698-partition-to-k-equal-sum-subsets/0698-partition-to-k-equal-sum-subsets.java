class Solution {
    public int target;
    public boolean[] used;
    public boolean backTrack(int ind,int[] nums,int k,int subsetSum){

        int n = nums.length;

        if(k == 0) return true;
        if(subsetSum == target) {
            return backTrack(0,nums,k-1,0);
        }

        for(int j = ind;j <n; j++){
            if(used[j] || subsetSum + nums[j] > target){
                continue;
            }
            used[j] = true;
            if(backTrack(j+1,nums,k,nums[j] + subsetSum)) return true;
            used[j] = false;

           
        }
         return false;
    }
    public boolean canPartitionKSubsets(int[] nums, int k) {
        int n = nums.length;
        used = new boolean[n];

        Arrays.fill(used,false);

        

        int totalSum = 0;
        for(int num : nums){
            totalSum += num;
        }

        if(totalSum % k != 0) return false;
        target = totalSum / k;

        return backTrack(0,nums,k,0);
    }
}