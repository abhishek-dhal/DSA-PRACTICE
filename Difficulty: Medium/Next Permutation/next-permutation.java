class Solution {
    
    void reverse(int[] arr,int i,int j){
        
        while(i < j){
            int temp = arr[i];
            
            arr[i] = arr[j];
            
            arr[j] = temp;
            
            
            i++;
            j--;
        }
    }
    void nextPermutation(int[] arr) {
        // code here
        
        
        int n = arr.length;
        
        int i = -1;
        
        int j = n - 2;
        
        while(j>= 0 &&arr[j] >= arr[j+1]){
            j--;
        }
        
        if(j < 0){
            reverse(arr,0,n-1);
            return;
        }
        
        i = j;
        
        int m = n - 1;
        
        while(arr[i] >=  arr[m]){
            m--;
        }
        
        int temp = arr[i];
        
        arr[i] = arr[m];
        
        arr[m] = temp;
        
        Arrays.sort(arr,i+1,n);
    }
}