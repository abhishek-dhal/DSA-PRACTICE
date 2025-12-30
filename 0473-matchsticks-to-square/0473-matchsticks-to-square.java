class Solution {
    public boolean backTrack(int ind,int[] matchsticks,int k,int subsetSum,int target,boolean[] used){
        int n = matchsticks.length;

        //base case
        //if k == 0 ---> means 4 sides are formed
        if(k == 0) return true;
        //if subsetSum becomes target means one side is formed so start to form new side
        if(subsetSum == target){
            //start from 0
            return backTrack(0,matchsticks,k-1,0,target,used);
        }
        //back Tracking
        for(int j = ind; j < n ; j++){
            if(used[j] || subsetSum + matchsticks[j] > target) continue;

            used[j] = true;

            if(backTrack(j+1,matchsticks,k,subsetSum + matchsticks[j],target,used)) return true;

            used[j] = false;
        }
        return false;
    }
    public boolean makesquare(int[] matchsticks) {
        int n = matchsticks.length;
        //as square has 4 sides k == 4
        int k = 4;

        int totalSum = 0;
        for(int num: matchsticks){
            totalSum += num;
        }

        //if totalSum is not divisible by k it is impossible to form square
        if(totalSum % k != 0) return false;

        int target = totalSum / k;

        //used a boolean array to track which element is used
        boolean[] used = new boolean[n];
        Arrays.fill(used,false);

        return backTrack(0,matchsticks,k,0,target,used);
    }

    //This can be more pruned by using sorting in descending order
    //such that large numbers are selected early to form the side
}