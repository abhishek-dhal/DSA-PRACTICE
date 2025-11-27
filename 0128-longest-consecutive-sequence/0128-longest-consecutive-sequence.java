class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;

        if(n == 0) return 0;

        Set<Integer> numSet = new HashSet<>();

        for(int num: nums){
            numSet.add(num);
        }

        int maxLen = 0;

        for(int num: numSet){

            if(!numSet.contains(num-1)){
                int currLen = 1;
                int currEl = num;

                while(numSet.contains(currEl+1)){
                    currEl++;
                    currLen++;
                    
                }

                maxLen = Math.max(maxLen,currLen);
            }
        }

        return maxLen;
    }
}