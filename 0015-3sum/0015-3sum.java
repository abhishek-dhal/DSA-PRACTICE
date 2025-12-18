class Solution {
    
    public List<List<Integer>> threeSum(int[] nums) {
       int n = nums.length;

        List<List<Integer>> res = new ArrayList<>();

        Arrays.sort(nums);
        //dont want dupicate so sort to avoid sorting later
        //after sorting 2 pointer can be applied j and k
        //to avoid duplicate move j and k if same as previous

        for(int i=0;i<n;i++){
            if(i > 0 && nums[i] == nums[i-1]) continue; //if not first then move if already used as triplet
            int j = i + 1;
            int k = n - 1;

            while(j < k) { //if j ,k cross we stop
               int sum = nums[i] + nums[j] + nums[k];

               if(sum < 0){ //if sum < 0  increase j to increase sum towards zero
                j++;
               }
               else if(sum >  0){ //if sum > 0 decrease k to decrease sum towards zero
                k--;
               }
               else{ //if sum == 0
                 List<Integer> ans = new ArrayList<>();
                 ans.add(nums[i]);
                 ans.add(nums[j]);
                 ans.add(nums[k]);
                 j++;
                 k--;
                 while(j < k && nums[j] == nums[j-1]) j++; // boundary check j < k if same move
                 while(j < k && nums[k] == nums[k+1]) k--; // boundary check j < k if same move
                 res.add(ans);

               }
            }
        }
        return res;


        
    }
}