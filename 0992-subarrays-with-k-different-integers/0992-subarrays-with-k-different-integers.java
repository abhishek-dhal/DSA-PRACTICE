class Solution {

    public int atMostK(int[] nums,int k){
        int n=nums.length;
        int left=0;
        int cnt=0;

        HashMap<Integer,Integer> map = new HashMap<>();


        for(int right=0;right<n;right++){
            int num=nums[right];
            map.put(num,map.getOrDefault(num,0)+1);

           //Stinking logic
            while(map.size() > k){
                int leftNum = nums[left];
                map.put(leftNum,map.getOrDefault(leftNum,0)-1);

                if(map.get(leftNum) == 0){
                    map.remove(leftNum);
                    
                }
                left++;
            }

            cnt = cnt + right-left+1;

        }
        return cnt;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMostK(nums,k) - atMostK(nums,k-1);
    }
}