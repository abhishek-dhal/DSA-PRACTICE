class Solution {
    
    public void reverse(int[] arr,int i,int j){
        
        
        while(i < j){
            int temp = arr[i];
            
            arr[i] = arr[j];
            
            arr[j] = temp;
            
            i++;
            
            j--;
        }
    }
    public void reverseInGroups(int[] arr, int k) {
        
        
        int i = 0;
        
        int j = k - 1;
        
        int n = arr.length;
        
        while(i < n && j < n){
            
            reverse(arr,i,j);
            
            i = i + k;
            
            j = j + k;
        }
        
        if(i < n){
            reverse(arr,i,n - 1);
        }
        
        
        
    }
}