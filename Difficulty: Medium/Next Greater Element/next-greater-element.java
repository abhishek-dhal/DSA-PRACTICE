class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        
        
        Stack<Integer> s = new Stack<>();
        
        int n = arr.length;
        
        ArrayList<Integer> a = new ArrayList<>();
        
        for(int i = n - 1; i >= 0; i--){
            
            
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]){
                s.pop();
            }
            
            if(s.isEmpty()) a.add(-1);
            else a.add(arr[s.peek()]);
            
            s.push(i);
        }
        
         Collections.reverse(a);
         
         return a;
        
    }
}