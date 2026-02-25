// User function Template for Java

class Solution {
    
    public static int[] find(int[] arr,int n){
        
        int curr = -1;
        int prev1 = arr[1];
        int prev2 = arr[0];
        
        for(int i = 2; i < n; i++){
            
            curr = prev1 + prev2;
            
            arr[i] = curr;
            
            prev2 = prev1;
            
            prev1 = curr; 
        }
        
        return arr;
    }
    // Function to return list containing first n fibonacci numbers.
    public static int[] fibonacciNumbers(int n) {
        // Your code here
        
        if(n == 0) return new int[0];
        
        if(n == 1) return new int[]{0};
        
        int[] arr = new int[n];
        
        arr[0] = 0;
        
        arr[1] = 1;
        
        return find(arr,n);
        
    }
}