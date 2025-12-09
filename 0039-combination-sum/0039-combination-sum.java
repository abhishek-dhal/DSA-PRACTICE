class Solution {
    private void findCombination(int ind,int[] candidates,int target,List<List<Integer>> ans,List<Integer> ds){
        if(candidates.length == ind){
            if(target == 0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        //pick
        if(candidates[ind] <= target){
            ds.add(candidates[ind]);
            findCombination(ind,candidates,target-candidates[ind],ans,ds);
            ds.remove(ds.size() -1);

        }

        //not pick
        findCombination(ind+1,candidates,target,ans,ds);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        findCombination(0,candidates,target,ans,new ArrayList<>());
        return ans;
    }
}