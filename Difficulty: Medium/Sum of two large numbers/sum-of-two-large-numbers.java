// User function Template for Java

class Solution {
    
    String reverseStr(String s){
        
        char[] arr = s.toCharArray();
        
        int n = arr.length;
        
        int i = 0;
        
        int j = n - 1;
        
        while(i < j){
            char temp = arr[i];
            
            arr[i] = arr[j];
            
            arr[j] = temp;
            
            i++;
            
            j--;
        }
        
        return new String(arr);
    }
    String findSum(String s1, String s2) {
        // code here
        
        int n = s1.length();
        
        int n2 = s2.length();
        
        int carry = 0;
        
        int i = n - 1;
        
        int j = n2 - 1;
        
        StringBuilder ans = new StringBuilder();
        
        while(i >= 0 || j >= 0 || carry != 0){
            
            int d1 = (i >= 0) ?  s1.charAt(i) - '0' : 0;
            
            int d2 = (j >= 0) ? s2.charAt(j) - '0' : 0;
            
            int sum = d1 + d2 + carry;
            
            ans.append(sum % 10);
            
            carry = sum / 10;
            
            i--;
            
            j--;
        }
        
         String res = reverseStr(ans.toString());
         
        int idx = 0;
        
        while(idx < res.length() - 1 && res.charAt(idx) == '0' ){
            idx++;
        }
        
       
        
        return res.substring(idx);
        
        
    }
}