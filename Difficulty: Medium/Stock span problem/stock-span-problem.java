class Solution {
    public int[] PSE(int[] arr){
        
        
        Stack<Integer> s = new Stack<>();
        
        int n = arr.length;
        
        int[] pse = new int[n];
        
        for(int i = 0; i < n ;i++){
            
            while(!s.isEmpty() && arr[s.peek()] <=  arr[i]){
                s.pop();
            }
            
            pse[i] = s.isEmpty() ? -1 : s.peek();
            
            s.push(i);
        }
        return pse;
    }
    public ArrayList<Integer> calculateSpan(int[] arr) {
        
        int n = arr.length;
        
        int[] pse = PSE(arr);
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int i = 0; i < n; i++){
            
            if(pse[i] == -1) ans.add(i + 1);
            
            else ans.add(i - pse[i]);
        }
        
        return ans;
       
        
    }
}