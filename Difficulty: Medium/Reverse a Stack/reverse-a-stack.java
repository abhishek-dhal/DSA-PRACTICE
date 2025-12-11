class Solution {
    public static void insertAtBottom(Stack<Integer> st,int element){
        //base case
        //if stack ---> push element
        
        if(st.isEmpty()){
            st.push(element);
            return;
        }
        
        int top = st.pop();
        
        insertAtBottom(st,element);
        st.push(top);
    }
    public static void reverseS(Stack<Integer> st){
        //bigger problem --> recursion solve small problem
        //base case
        if(st.isEmpty()){
            return;
        }
        
        
        int top = st.pop();
        reverseS(st);
        
        //here recursion reverse we have to insert at bottom
        
        insertAtBottom(st,top);
        
    }
    public static void reverseStack(Stack<Integer> st) {
        // code here
        
        reverseS(st);
        return;
        
    }
}
