class Pair{
    int el;
    int cnt;
    
    Pair(int el,int cnt){
        this.el = el;
        this.cnt = cnt;
    }
}
class Solution {
    
    public ArrayList<Integer> nextFreqGreater(int[] arr) {
        // code here
        
        HashMap<Integer,Integer> freq = new HashMap<>();
        
        int n = arr.length;
        
        for(int i = 0; i < n; i++){
            
            freq.put(arr[i],freq.getOrDefault(arr[i],0)+1);
        }
        
        Stack<Pair> st = new Stack<>();
        
        // st.push(new Pair(-1,-1));
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int i = n - 1; i >= 0; i--){
            
            while(!st.isEmpty() && st.peek().cnt <= freq.get(arr[i])){
                st.pop();
            }
            
            // ans.add(st.peek().el);
            
            if(st.isEmpty()) ans.add(-1);
            else ans.add(st.peek().el);
            
            st.push(new Pair(arr[i],freq.get(arr[i])));
        }
        
        Collections.reverse(ans);
        return ans;
    }
}