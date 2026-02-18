class Solution {
    static void reverse(int[] arr,int start,int end){
        
        while(start < end){
            int temp = arr[start];
            
            arr[start] = arr[end];
            
            arr[end] = temp;
            
            start++;
            
            end--;
        }
    }
    static void rotateArr(int arr[], int d) {
        // code here
        
        int n = arr.length;
        
        //for larger d values
        
        d = d % n;
        
        //first d elements
        
        reverse(arr,0,d-1);
        
        //rest n-d elements
        
        reverse(arr,d,n-1);
        
        //whole array
        
        reverse(arr,0,n - 1);
        
    }
}