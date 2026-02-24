class Solution {
    public int myAtoi(String s) {
        // code here
        
        int i = 0;
        
        int n = s.length();
        
        while(i < n && Character.isWhitespace(s.charAt(i))){
            i++;
        }
        
        if(i == n) return 0;
        
        String str = s.substring(i);
        
        int m = str.length();
        
        int sign = 1;
        
        if(str.charAt(0) == '-'){
            sign = -1;
            i++;
        }
        
        else if(str.charAt(0) == '+'){
            i++;
        }
        
       int res = 0;
       
       while(i < n && Character.isDigit(s.charAt(i))){
           
           int digit = s.charAt(i) - '0';
           
           if(res > (Integer.MAX_VALUE - digit)/10 ){
               return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
           }
           
           res = res * 10 + digit;
           
           i++;
       }
       
       
       return res * sign;
        
        
        
        
        
    }
}