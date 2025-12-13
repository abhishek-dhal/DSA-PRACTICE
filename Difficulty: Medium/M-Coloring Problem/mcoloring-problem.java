class Solution {
    public HashMap<Integer,List<Integer>> adj;
    public int[] col;
    
    boolean isSafe(int c,int idx){
        
        for(int ad: adj.get(idx)){
            if(col[ad] == c) return false;
        }
        return true;
    }
    
    boolean solve(int ind,int v,int m){
        if(ind == v) return true;
        
        for(int color = 1;color <= m;color++){
            if(isSafe(color,ind)){
                col[ind] = color;
                if(solve(ind+1,v,m) == true) return true;
                col[ind] = 0;
            }
        }
        return false;
    }
    boolean graphColoring(int v, int[][] edges, int m) {
        
        adj = new HashMap<>();
        
        col = new int[v];
        
        //prepare the adj list map
        for(int i=0;i<v;i++){
            adj.put(i,new ArrayList<>());
        }
        
        for(int[] e : edges){
            int u = e[0];
            int w = e[1];
            
            adj.get(u).add(w);
            adj.get(w).add(u);
        }
        
        if(solve(0,v,m) == true) return true;
        
        return false;
        
        
    }
}