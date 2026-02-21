// User function Template for Java

class Solution {
    static String Kdigits(int n, int k) {
        // complete the function here
        
       StringBuilder result = new StringBuilder();
       
       int remainder = 1;
       
       for(int i = 0; i < k; i++){
           
           remainder = remainder * 10;
           
           int digit = remainder / n;
           
           result.append(digit);
           
           remainder = remainder % n;
       }
       
       return result.toString();
        
    }
}