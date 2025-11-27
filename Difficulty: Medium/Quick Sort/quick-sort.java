class Solution {
    public void quickSort(int[] arr, int low, int high) {
        
        //pick a pivot and place it in its correct order
        //smaller on the left and larger on the right
        
        //for finding correct pos of pivot find first greater el from left 
        //find first smaller el from right then swap both 
        //continue el larger from left and smaller from right then swap
        // stop when j crossed i
        
        
          if(low < high){
              int pIndex = partition(arr,low,high);
              quickSort(arr,low,pIndex-1);
              quickSort(arr,pIndex+1,high);
          }
    }

    private int partition(int[] arr, int low, int high) {
        
        int pivot = arr[low];
        int i = low;
        int j = high;
        
        while(i<j){
            while(i <= high && arr[i] <= pivot){
                i++;
            }
            
            while(j >= low && arr[j] > pivot ){
                j--;
            }
            
            if(i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        
        
        return j;
        
        
    }
}