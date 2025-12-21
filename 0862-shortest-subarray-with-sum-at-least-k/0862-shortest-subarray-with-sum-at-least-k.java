class Solution {
    public int shortestSubarray(int[] nums, int k) {
        
        int n = nums.length;
        
        //increasing order of monotonic deque
        Deque<Integer> dq = new ArrayDeque<>();

        //prefix sum array
        long[] prefix = new long[n];
       

         int minLen = Integer.MAX_VALUE;

        int j = 0;

        dq.offerLast(-1);

        while(j < n){
            if(j == 0){
                prefix[j] = nums[j]; 
            }
            else{
                prefix[j] = prefix[j-1] + nums[j];
            }

            if(prefix[j] >= k){
                minLen = Math.min(minLen,j+1);
            }

            //need to shrink the window or not
            while(!dq.isEmpty()){
                int idx = dq.peekFirst();
                long prevSum = (idx == -1) ? 0 : prefix[idx];

                if(prefix[j] - prevSum >= k){
                    minLen = Math.min(minLen,j - idx);
                    dq.pollFirst();
                }
                else{
                    break;
                }
            }

            while(!dq.isEmpty()){
               int idx = dq.peekLast();
               long prevSum = (idx == -1) ? 0 : prefix[idx];

               if(prefix[j] <= prevSum){
                dq.pollLast();
               }
               else{
                break;
               }
            }

            dq.offerLast(j);
            j++;
        }

        return minLen == Integer.MAX_VALUE ? -1 : minLen;


    }
    // Use prefix sums + a monotonic increasing deque to find shortest subarray.
    // Pop from front when sum ≥ k (shortest), pop from back to keep smaller prefix sums.

}