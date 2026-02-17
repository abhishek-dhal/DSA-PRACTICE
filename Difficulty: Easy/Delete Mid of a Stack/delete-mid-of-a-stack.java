class Solution {
    // Function to delete middle element of a stack.
    public void deleteMid(Stack<Integer> s) {
        
        
        int n = s.size();
        
        int cnt = 0;
        
        Stack<Integer> temp = new Stack<>();
        
        while(cnt < n/2){
            int c = s.pop();
            temp.push(c);
            cnt++;
        }
        
        s.pop();
        
        while(!temp.isEmpty()){
            int c = temp.pop();
            s.push(c);
        }
        
        
    }
}