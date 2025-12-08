class Solution {
    public static int minCost(int[] arr) {
        // code here
        
        int n = arr.length;
        
        //min-heap
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int num: arr){
            pq.offer(num);
        }
        
        int total_cost = 0;
        
        while(pq.size() != 1){
            int num1 = pq.poll();
            int num2 = pq.poll();
            int sum = num1 + num2;
            total_cost += sum;
            pq.offer(sum);
        }
        
       // total_cost += pq.poll();
        
        
        return total_cost;
        
    }
}