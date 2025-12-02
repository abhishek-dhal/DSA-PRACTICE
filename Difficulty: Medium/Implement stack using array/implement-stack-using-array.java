import java.util.NoSuchElementException;
class myStack {
    
        private int[] stackArray;
        private int top;
        private int capacity;  

    public myStack(int n) {
        // Define Data Structures
        stackArray = new int[n];
        top = -1;
        capacity = n;
        
        
        
        
    }

    public boolean isEmpty() {
        // check if the stack is empty
        
        return (top == -1);
    }

    public boolean isFull() {
        // check if the stack is full
        
        return (top == capacity-1);
    }

    public void push(int x) {
        // Inserts x at the top of the stack
        
        if(isFull()){
            // System.out.println("Stack is full");
            return;
        }
        top = top+1;
        stackArray[top] = x;
        
    }

    public int pop() {
        // Removes an element from the top of the stack
        if(isEmpty()){
            // System.out.println("The stack is empty");
            //  throw new NoSuchElementException("Stack is empty");
            return -1;
        }
        int poppedEl = stackArray[top];
        top = top - 1;
       
        return poppedEl;
    }

    public int peek() {
        // Returns the top element of the stack
        if(isEmpty()){
            // System.out.println("The stack is empty");
            // throw new NoSuchElementException("Stack is empty");
            return -1;
        
        }
        return stackArray[top];
    }
}