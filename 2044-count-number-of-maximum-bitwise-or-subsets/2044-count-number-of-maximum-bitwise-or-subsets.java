class Solution {
    public int n;
    public int maxOr = 0;
    public int cnt = 0;

    public void solve(int ind,int resOr,int[] nums){
        if(ind == n){
            if(resOr == maxOr){
                cnt++;
            }
            return;
        }

        //pick
        solve(ind+1,resOr | nums[ind], nums);

        //not-pick
        solve(ind+1,resOr,nums);
    }
    public int countMaxOrSubsets(int[] nums) {
        n = nums.length;

        for(int i=0;i<n;i++){
            maxOr = maxOr | nums[i];
        }

        solve(0,0,nums);

        return cnt;
    }
}