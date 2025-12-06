class Solution {
    public int findKthLargest(int[] nums, int k) {

        
        PriorityQueue<Integer> minheap = new PriorityQueue<>();

        for(int num: nums){
           
           //add the num to the heap
            minheap.offer(num);

           //if heap size exceeds k then current root is not a potential option discard it
           //remove it from(that is root) from heap
            if(minheap.size() > k){
                minheap.poll();
            }
        }
        
        //after traversal through array the root is the kth largest
        return minheap.peek();

        
    }
}