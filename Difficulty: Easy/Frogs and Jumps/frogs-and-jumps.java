// User function Template for Java

class Solution {
    public int[] visited;
    public int unvisitedLeaves(int N, int leaves, int frogs[]) {
        visited = new int[leaves+1];
        
        boolean[] frogUsed = new boolean[leaves+1];
        
        Arrays.fill(visited,-1);
        
       
        
       for(int frog : frogs){
           //ignore who have excess capacity
           if(frog > leaves) continue;
           
           //avoid duplicate processing
           if(frogUsed[frog]) continue;
           
           frogUsed[frog] = true;
           
           for(int leaf = frog;leaf<=leaves;leaf = leaf+frog){
               visited[leaf] = 1;
           }
           
       }
        
        
        
        
        int cnt = 0;
        for(int i=1;i<=leaves;i++){
            if(visited[i] == -1){
                cnt++;
            }
        }
        
        return cnt;
        
    }
}
