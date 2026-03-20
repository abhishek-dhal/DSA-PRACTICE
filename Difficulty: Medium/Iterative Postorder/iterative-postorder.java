// User function Template for Java

/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/
class Tree {
    ArrayList<Integer> postOrder(Node node) {
        
        ArrayList<Integer> post = new ArrayList<>();
        
        Stack<Node> st = new Stack<>();
        
        Node curr = node;
        
        Node temp = null;
        
        while(curr != null || !st.isEmpty()){
            
            if(curr != null){
                st.push(curr);
                curr = curr.left;
            }
            else{
                temp = st.peek().right;
                
                if(temp == null){
                    temp = st.peek();
                    st.pop();
                    post.add(temp.data);
                    while(!st.isEmpty() && temp == st.peek().right){
                        temp = st.peek();
                        st.pop();
                        
                        post.add(temp.data);
                        
                    }
                }
                else{
                    curr = temp;
                }
            }
        }
        
        return post;
        
    }
}