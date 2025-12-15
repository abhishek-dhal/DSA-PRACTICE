class Solution {
    public int largestCombination(int[] candidates) {
        int ans = 0;
        //we check the maximum number of elements of candidates have atleast on bit 1(on) 
        //that is the max length
        //bitwise and is monotonic decreasing and fastly
        for(int bit =0;bit<32;bit++){
            int cnt = 0;
            for(int x : candidates){
                if((x & (1 << bit)) != 0){
                    cnt++;
                }
            }
            ans = Math.max(ans,cnt);
        }
        return ans;
    }
}