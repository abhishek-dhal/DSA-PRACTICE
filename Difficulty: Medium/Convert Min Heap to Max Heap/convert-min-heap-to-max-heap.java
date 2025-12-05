// User function Template for Java

// class maxHeap{
    
    
//     List<Integer> heap;
    
//     public maxHeap(){
//         heap = new ArrayList<Integer>();
//     }
    
//     public maxHeap(int[] arr,int n){
        
//         heap = new ArrayList<Integer>();
//         int size=n;
        
//         for(int element:arr){
//             heap.add(element);
//         }
        
//         for(int i = size/2 - 1;i >= 0;i--){
//             heapify(i);
//         }
        
//     }
    
//     public static void heapify(int idx){
        
//         int size = heap.size();
        
//         int largest = idx;
        
//         while(idx < size){
//             int leftChildIdx = 2*idx + 1;
//             int rightChildIdx = 2*idx + 2;
            
//             if(leftChildIdx < size && heap.get(leftChildIdx) > heap.get(largest)){
//                 largest = leftChildIdx;
                
                
//             }
//             if(rightChildIdx < size && heap.get(rightChildIdx) > heap.get(largest)){
//                 largest = rightChildIdx;
                
//             }
//             if(largest != idx){
//                 Collections.swap(heap,largest,idx);
//                 idx = largest;
                
//             }
//             else{
//                 break;
//             }
//         }
//     }
// }


class Solution {
    
       public static void heapify2(int[] arr,int n,int idx){
    
    while(true){
        int largest = idx;
        int left = 2*idx+1;
        int right = 2*idx+2;
        
        if(left < n && arr[left] > arr[largest]) largest = left;
        if(right < n && arr[right] > arr[largest]) largest = right;
        
        if(largest != idx){
            int temp = arr[idx];
            arr[idx] = arr[largest];
            arr[largest] = temp;
            
            idx = largest;
        }
        else{
            break;
        }
    }
}

    static void convertMinToMaxHeap(int N, int arr[]) {
        // code here
        

        
        
        
        for(int i=N/2 - 1;i>=0;i--){
            heapify2(arr,N,i);
        }
        
    }
}
