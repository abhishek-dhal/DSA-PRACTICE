class Solution {
    int thirdLargest(int arr[]) {
        // code here
        
        int n = arr.length;
        
        if(n < 3) return -1;
        
        int largest = Integer.MIN_VALUE;
        
        int sLargest = Integer.MIN_VALUE;
        
        int tLargest = Integer.MIN_VALUE;
        
        for(int i = 0; i < n; i++){
            
            if(arr[i] > largest){
                tLargest = sLargest;
                sLargest = largest;
                largest = arr[i];
            }
            
            else if( arr[i] > sLargest){
                tLargest = sLargest;
                sLargest = arr[i];
                
            }
            else if( arr[i] > tLargest){
                
                tLargest = arr[i];
            }
        }
        
        return (tLargest == Integer.MIN_VALUE) ? -1 : tLargest;
    }
}