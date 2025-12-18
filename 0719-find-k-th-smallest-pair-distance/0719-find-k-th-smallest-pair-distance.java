class Solution {
    public int countPairs(int[] nums,int mid){
        int n = nums.length;
        int cnt = 0;
        int j = 0;

        for(int i=0;i<n;i++){
            while(j < n && Math.abs(nums[j] - nums[i]) <= mid){
                j++;
            }
            cnt = cnt + (j-i-1);
        }
        return cnt;
    }
    public int smallestDistancePair(int[] nums, int k) {
        
        int n = nums.length;

        Arrays.sort(nums);

        int low = 0;
        int high = nums[n-1] - nums[0];

        while(low < high){
            int mid = low + (high - low)/2;

            int cnt = countPairs(nums,mid);

            if(cnt >= k){
                high = mid;
            }
            else{
                low = mid+1;
            }
        }
        return low;

         // We are NOT searching indices, we are searching a distance value
         // Distance range: [0 .. max(nums) - min(nums)]
         // For a guessed distance mid:
         //   count how many pairs have distance <= mid
        // If count >= k → mid could be answer → try smaller
        // Else → mid too small → try larger



    }
}