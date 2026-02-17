class myQueue {

    // Initialize your data members
    Stack<Integer> input = new Stack<>();
    
    Stack<Integer> output = new Stack<>();

    void enqueue(int x) {
        // Implement enqueue operation
        
        input.push(x);
    }

    void dequeue() {
        // Implement dequeue operation
        
        if(output.isEmpty()){
            
            while(!input.isEmpty()){
                output.push(input.pop());
            }
        }
        
        if(!output.isEmpty()){
            output.pop();
        }
    }

    int front() {
        // Implement front operation
        
        if(output.isEmpty()){
            
            while(!input.isEmpty()){
                output.push(input.pop());
            }
        }
        
        return output.isEmpty() ? -1 : output.peek();
    }

    int size() {
        // Implement size operation
        
        return input.size() + output.size();
    }
}
