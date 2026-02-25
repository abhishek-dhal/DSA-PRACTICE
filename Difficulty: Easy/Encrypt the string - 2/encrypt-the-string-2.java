// User function Template for Java

class Solution {
    // static String reverseS(String s){
        
    //     char[] arr = s.toCharArray();
        
    //     int n = arr.length;
        
    //     int i = 0;
        
    //     int j = n - 1;
        
    //     while(i < j){
            
    //         char temp = arr[i];
            
    //         arr[i] = arr[j];
            
    //         arr[j] = temp;
            
    //         i++;
            
    //         j--;
    //     }
        
    //     return new String(arr);
    // }
    static String encryptString(String S) {
        
      StringBuilder sb = new StringBuilder();
      
      int n = S.length();
      
      int cnt = 1;
      
      for(int i = 1; i <= n; i++){
          
          if(i < n && S.charAt(i) == S.charAt(i-1)){
              cnt++;
          }
          else{
             String part = Integer.toHexString(cnt) + S.charAt(i-1);

                // Insert at beginning instead of reversing later
                sb.insert(0, part);
              
              cnt = 1;
          }
      }
      
      String str = sb.toString();
      
      return str;
        
    }
};