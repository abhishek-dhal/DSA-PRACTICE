// User function Template for Java

class Solution {
    static long kthDigit(int a, int b, int k) {
        // code here
        
        long res = (long)Math.pow(a , b);
        
        for(int i = 1; i < k; i++){
            
            res = res / 10;
        }
        
        return res % 10;
    }
}