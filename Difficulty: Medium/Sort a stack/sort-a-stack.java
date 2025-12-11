class Solution {
    public void sortS(Stack<Integer> st){
        PriorityQueue<Integer> min = new PriorityQueue<>();
        while(!st.isEmpty()){
            min.offer(st.peek());
            st.pop();
        }
        
        while(!min.isEmpty()){
            int el = min.poll();
            st.push(el);
        }
        
        
    }
    public void sortStack(Stack<Integer> st) {
        
        // code here
        
      sortS(st);
      return;
        
    }
}