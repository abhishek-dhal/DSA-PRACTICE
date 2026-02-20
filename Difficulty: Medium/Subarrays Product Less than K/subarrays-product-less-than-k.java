// User function Template for Java

class Solution {

    public long countSubArrayProductLessThanK(long arr[], int n, long k) {
        
        
        long res = 0;
        
        long prod = 1;
        
        for(int start = 0,end = 0; end < n; end++){
            
            
            //add element to product first
            
            prod *= arr[end];
            
            //shrink left unless prod < k
            while(start <= end && prod >= k){
                prod /= arr[start++];
                
            }
            
            if(prod < k){
                int len = end - start + 1;
                res += len;
            }
        }
        return res;
    }
}