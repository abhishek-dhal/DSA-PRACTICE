class Solution {
    public int leastInterval(char[] tasks, int n) {

      if(n == 0) return tasks.length;

      int[] freq = new int[26];
      //count freq of each task in tasks
      for(char c : tasks){
        freq[c - 'A']++;
      }

      //creation of max-heap
      PriorityQueue<int[]> heap = new PriorityQueue<>((a,b)->b[1]-a[1]);

      for(int i=0;i<26;i++){
       if(freq[i] > 0){
         heap.offer(new int[]{i,freq[i]});
       }
      }

      int time=0;

      while(!heap.isEmpty()){
        
        //rest for cooldown time
        List<int[]> temp = new ArrayList<>();
        int slots = n+1;

        while(slots>0 && !heap.isEmpty()){
            int[] curr = heap.poll();
            curr[1]--;
            time++;
            slots--;
            //still left store for next cycle
            if(curr[1] > 0){
                temp.add(curr);
            }
        }

        for(int[] t:temp){
            heap.offer(t);
        }

        //task completed if heap is empty break go for next cycle
        if(heap.isEmpty()){
            break;
        }
        //if heap is empty means task done and exist but cycles there add idle 
        time = time + slots;
      }

      return time;
        
    }
}