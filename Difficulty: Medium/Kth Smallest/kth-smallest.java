class Solution {
    public int kthSmallest(int[] arr, int k) {
        // Code here
        PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int num: arr){
            
            maxheap.offer(num);
            
            if(maxheap.size() > k){
                maxheap.poll();
            }
        }
        
        return maxheap.peek();
        
    }
}
