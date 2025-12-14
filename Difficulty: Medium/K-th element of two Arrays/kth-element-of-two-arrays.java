class Solution {
    public PriorityQueue<Integer> maxheap;
    
    
   
    public int kthElement(int a[], int b[], int k) {
        
        maxheap = new PriorityQueue<>((x,y)->y-x);
        
        for(int num: a){
            maxheap.offer(num);
            
            if(maxheap.size() > k){
                maxheap.poll();
            }
        }
        
        for(int num: b){
            maxheap.offer(num);
             if(maxheap.size() > k){
                maxheap.poll();
            }
            
            
        }
       
        
        return maxheap.peek();
        
    }
}