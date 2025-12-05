class maxHeap {
    
    List<Integer> heap;

    // Constructor
    public maxHeap() {
        // Initialize your data members
        heap = new ArrayList<Integer>();
    }
    
    public void heapify(int idx){
        
        int size = heap.size();
        
        int largest = idx;
        
        while(idx < size){
            
            int leftChildIdx = 2*idx+1;
            int rightChildIdx = 2*idx+2;
            
            if(leftChildIdx < size && heap.get(leftChildIdx) > heap.get(largest)){
                largest = leftChildIdx;
            }
            
            if(rightChildIdx < size && heap.get(rightChildIdx) > heap.get(largest)){
                largest = rightChildIdx;
            }
            
            if(largest != idx){
                Collections.swap(heap,largest,idx);
                idx = largest;
            }
            else{
                break;
            }
        }
    }
    
    public maxHeap(int[] arr){
        heap = new ArrayList<Integer>();
        int n = arr.length;
        
        for(int num: arr){
            heap.add(num);
        }
        
        for(int i= n/2 - 1;i>=0;i--){
            heapify(i);
        }
    }

    public void push(int x) {
        // Insert x into the heap
        heap.add(x);
        
        int idx = heap.size()-1;
        
        while(idx > 0){
            int parentIdx = (idx-1)/2;
            
            if(heap.get(idx) > heap.get(parentIdx)){
                Collections.swap(heap,idx,parentIdx);
                idx = parentIdx;
            }
            else{
                break;
            }
        }
    }

    public void pop() {
        // Remove the top (maximum) element
        if(heap.size() == 0){
            return;
        }
        
        int lastIdx = heap.size() -1;
        
        int valRemoved = heap.get(lastIdx);
        
        heap.set(0,heap.get(lastIdx));
        
        heap.remove(lastIdx);
        
        heapify(0);
        
        
    }

    public int peek() {
        // Return the top element or -1 if empty
        
        if(heap.size() == 0){
            return -1;
        }
        
        return heap.get(0);
    }

    public int size() {
        // Return the number of elements in the heap
        return heap.size();
    }
}