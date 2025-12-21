class Solution {
    public int n;
    public int longestSubarray(int[] nums, int limit) {
        n = nums.length;
        
        //two deque to get max and min index for the current window in O(1) time while
        //traversing
        Deque<Integer> maxDq = new ArrayDeque<>(); //maxDq
        Deque<Integer> minDq = new ArrayDeque<>(); //minDq

        int left = 0;

        int ans = Integer.MIN_VALUE;

        for(int right = 0;right<n;right++){

            while(!maxDq.isEmpty() && nums[right] > nums[maxDq.peekLast()]){
                maxDq.pollLast();
            }
            maxDq.offerLast(right);

            while(!minDq.isEmpty() && nums[right] < nums[minDq.peekLast()]){
                minDq.pollLast();
            }
            minDq.offerLast(right);

            //shrink window if invalid

            while(nums[maxDq.peekFirst()] - nums[minDq.peekFirst()] > limit){

                if(maxDq.peekFirst() == left){
                    maxDq.pollFirst();
                }

                if(minDq.peekFirst() == left){
                    minDq.pollFirst();
                }

                left++;
            }

            ans = Math.max(ans,right - left + 1);
        }

        return ans;

    }
}