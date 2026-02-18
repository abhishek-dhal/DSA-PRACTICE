class Solution {
    public void swap(int[] arr,int start,int end){
        
        int temp = arr[start];
        
        arr[start] = arr[end];
        
        arr[end] = temp;
    }
    public void sortInWave(int arr[]) {
        
        
        int n = arr.length;
        
        int i = 0;
        
        int j = 1;
        
        while(i < n && j < n){
            swap(arr,i,j);
            
            i = i + 2;
            j = j + 2;;
        }
        
        
        
    }
}
