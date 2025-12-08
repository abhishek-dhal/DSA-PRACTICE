class Solution {
    public ArrayList<Integer> topKSumPairs(int[] a, int[] b, int k) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        
        int m = a.length;
        int n = b.length;
        
        Arrays.sort(a);
        Arrays.sort(b);
        
        //max-heap
        PriorityQueue<int[]> pq = new PriorityQueue<>((l,r)->r[0]-l[0]);
        
        HashSet<String> seen = new HashSet<>();
        
        int i=m-1;
        int j=n-1;
        
        pq.offer(new int[]{a[i]+b[j],i,j});
        seen.add(i + "," + j);
        
        while(k>0 && !pq.isEmpty()){
            
            int[] curr = pq.poll();
            int sum = curr[0];
            int x = curr[1];
            int y = curr[2];
            
            res.add(sum);
            k--;
            
            if(x-1 >= 0){
                String key1 = (x-1) + "," + y;
                
                if(!seen.contains(key1)){
                    pq.offer(new int[]{a[x-1]+b[y],x-1,y});
                    seen.add(key1);
                }
                
            }
            
            if(y-1 >= 0){
                String key2 = x + "," + (y-1);
                
                if(!seen.contains(key2)){
                    pq.offer(new int[]{a[x]+b[y-1],x,y-1});
                    seen.add(key2);
                }
            }
        }
        return res;
    }
}