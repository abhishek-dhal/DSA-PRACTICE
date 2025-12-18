class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
         int n = nums.length;

         List<List<Integer>> res = new ArrayList<>();

         Arrays.sort(nums);
         //dont want dupicate so sort to avoid sorting later
        //after sorting 2 pointer can be applied j and k
        //to avoid duplicate move j and k if same as previous

         for(int i=0;i<n;i++){
            if(i > 0 && nums[i] == nums[i-1]) continue; //if not first then move if already used as triplet
            for(int j=i+1;j<n;j++){
                if(j > i+1 && nums[j] == nums[j-1]) continue; //if not first then move if already used as triplet

                int k = j + 1;
                int m = n - 1;

                while(k < m){
                    long sum = (long)nums[i] + nums[j] + nums[k] + nums[m];

                    if(sum < target){
                        k++;
                    }
                    else if(sum > target){
                        m--;
                    }
                    else{ //if sum == 0
                        List<Integer> ans = new ArrayList<>();
                        ans.add(nums[i]);
                        ans.add(nums[j]);
                        ans.add(nums[k]);
                        ans.add(nums[m]);
                        k++;
                        m--;
                        while(k < m && nums[k] == nums[k-1]) k++; // boundary check k < m if same move
                        while(k < m && nums[m] == nums[m+1]) m--; // boundary check k < m if same move
                        res.add(ans);
                    }
              }
            }
         }
         return res;

    }
}