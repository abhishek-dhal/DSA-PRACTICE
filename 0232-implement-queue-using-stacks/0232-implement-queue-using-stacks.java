class MyQueue {
    
    //two stack are needed
    Stack<Integer> s1;
    Stack<Integer> s2;

    public MyQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public void moveElements(){
        if(s2.isEmpty()){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }
    }
    
    public void push(int x) {
        //s1 is used for push or storing ,read
        s1.push(x);
    }
    
    public int pop() {

        //As we need to pop we first move elements or shift elements from s1 ----> s2
        moveElements();
        

        // for pop s2 is used for maintain FIFO
        return s2.pop();
        
    }
    
    public int peek() {
        
        moveElements();
        
        //for peek s2 is used
        return s2.peek();
    }
    
    public boolean empty() {
        //if both stack empty then only we can say queue is empty

        if(s1.empty() && s2.empty()){
            return true;
        }
        return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */