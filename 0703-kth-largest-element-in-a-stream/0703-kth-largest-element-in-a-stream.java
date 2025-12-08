class KthLargest {

    private PriorityQueue<Integer> pq;
    private int k;

    public KthLargest(int k, int[] nums) {
        pq = new PriorityQueue<Integer>();
        this.k = k;

        for(int num: nums){
            pq.offer(num);

            if(pq.size() > k){
                //if size exceed k remove smallest so that always k no of elements present in pq
                pq.poll();

            }
        }
    }
    
    public int add(int val) {
        pq.offer(val);

        if(pq.size() > k){
            pq.poll();
        }

        //pq root element is always the kth highest
        return pq.peek();
        
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */