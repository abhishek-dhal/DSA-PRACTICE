class Solution {
    static List<Long> generateSubsetSum(int[] arr){
        int n = arr.length;
        int total = 1 << n;
        List<Long> sums = new ArrayList<>();

        for(int mask=0;mask<total;mask++){
            long sum = 0L;
            for(int k=0;k<n;k++){
                if((mask & (1 << k)) != 0){
                    sum = sum + arr[k];
                }
            }
            sums.add(sum);
        }
            
            return sums;
    }
    public int minAbsDifference(int[] nums, int goal) {
        int n = nums.length;

        int mid = n / 2;

        int[] left = Arrays.copyOfRange(nums,0,mid);
        int[] right = Arrays.copyOfRange(nums,mid,n);

        //generate left and right half all subset sums
        List<Long> leftSums = generateSubsetSum(left);
        List<Long> rightSums = generateSubsetSum(right);

        //sort the rightSums for binary search
        Collections.sort(rightSums);

        long ans = Long.MAX_VALUE;

        for(long leftSum : leftSums){
            long target = goal - leftSum;

            int idx = Collections.binarySearch(rightSums,target);
            
            //exact match found so return abs diff as 0
            if(idx >= 0) return 0;


            idx = -idx - 1;

            //nearer right sum to target can be 2 possibilities
            //one at idx 
            //two at idx-1
            //at idx greater than target
            //at idx-1 smaller than target
            //both can create min abs difference
            //so checking both

            if(idx < rightSums.size()){
                ans = Math.min(ans,Math.abs(leftSum + rightSums.get(idx) - goal));
            }
            if(idx - 1 >= 0){
                    ans = Math.min(ans,Math.abs(leftSum + rightSums.get(idx-1) - goal));
                }
        }
        return (int)ans;
    }
}