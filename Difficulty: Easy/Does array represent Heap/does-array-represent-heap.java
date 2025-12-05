// User function Template for Java

class Solution {

    public boolean countSub(long arr[], long n) {
        // Your code goes here
        
        if(n<=1) return true;
        
        int sn = (int)n;
        
        
        for(int i = sn/2 - 1;i>=0;i--){
            
            
            int left = 2*i+1;
            int right = 2*i+2;
            
            if(left < sn && arr[left] > arr[i]){
                return false;
            }
            if(right < sn && arr[right] > arr[i]){
                return false;
            }
           
        }
        
        return true;
    }
}