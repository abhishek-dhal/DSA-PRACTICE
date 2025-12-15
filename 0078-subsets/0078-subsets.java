class Solution {
    public List<List<Integer>> result;
    public int n;
    public void solve(int ind,int[] nums,List<Integer> path){
        
        //no base case as every subset is required
        result.add(new ArrayList<>(path));

        for(int i=ind;i<n;i++){
            if( i > ind && nums[i] == nums[i-1]) continue;
            path.add(nums[i]);
            solve(i+1,nums,path);
            path.remove(path.size()-1);
        }
    }
    public List<List<Integer>> subsets(int[] nums) {
        result = new ArrayList<>();
        n = nums.length;
        Arrays.sort(nums);
        solve(0,nums,new ArrayList<>());

        return result;

    }
}