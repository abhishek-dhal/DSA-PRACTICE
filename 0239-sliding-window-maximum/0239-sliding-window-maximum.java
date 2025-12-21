class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        //when new element comes nums[i],make space for it(window size canot be greater than k)
        //Now, when nums[i] comes, there is no need to keep small elements in that window ,pop them
        //Now push i in dequeue --> for nums[i]
        //Now if(i >= k-1) ,then deq front is our answer for that window

        int n = nums.length;

        int[] res = new int[n-k+1];

        Deque<Integer> dq = new ArrayDeque<>();

        for(int i=0;i<n;i++){

            // step-01 make space for nums[i]
            // <= i-k
            while(!dq.isEmpty() && dq.peekFirst() <=i-k){
                dq.pollFirst();
            }

            //step-02 
            while(!dq.isEmpty() && nums[i] >= nums[dq.peekLast()]){
                dq.pollLast();
            }

            //step-03
            dq.offerLast(i);

            //step-04

            if(i >= k - 1){
                res[i-k+1] = nums[dq.peekFirst()];
            }


        }
        return res;
    }
}