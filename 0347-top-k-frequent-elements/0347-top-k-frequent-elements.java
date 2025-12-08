class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;

        HashMap<Integer,Integer> fmap = new HashMap<>();
        //store el freq in map
        for(int el: nums){
            fmap.put(el,fmap.getOrDefault(el,0)+1);
        }

        List<Integer> ls = new ArrayList<>();
        //max heap comparator used
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)-> b[1]-a[1]);

        for(Map.Entry<Integer,Integer> entry : fmap.entrySet()){
            Integer val = entry.getKey();
            Integer cnt = entry.getValue();

            pq.offer(new int[]{val,cnt});
        }

        int[] res = new int[k];

        for(int i=0;i<k;i++){
            int[] node = pq.poll();
            res[i] = node[0];
        }
        return res;
    }
}