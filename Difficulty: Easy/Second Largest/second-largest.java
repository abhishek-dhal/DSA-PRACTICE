class Solution {
    public int getSecondLargest(int[] arr) {
        
        int largest = arr[0];
        
        int sLargest = -1;
        
        int n = arr.length;
        
        for(int i = 1; i<n;i++){
            
            if(arr[i] > largest){
                sLargest = largest;
                 largest = arr[i];
            }
            
            else if(arr[i] < largest && arr[i] > sLargest){
                sLargest = arr[i];
            }
        }
        
        return sLargest;
        
    }
}