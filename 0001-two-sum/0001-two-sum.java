class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int n=nums.length;

        HashMap<Integer,Integer> map = new HashMap<>();

        int[] ans = new int[2];

        for(int i=0;i<n;i++){
            int complement = target - nums[i];

            if(map.containsKey(complement)){
                ans[0] = map.get(complement);
                ans[1] = i;
            }

            map.put(nums[i],i);
        }

        return ans;
    }
}