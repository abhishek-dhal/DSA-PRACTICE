class Solution {
    
    public String reverseString(String s){
        
        char[] arr = s.toCharArray();
        
        int i = 0;
        
        int j = arr.length - 1;
        
        while(i < j){
            char temp = arr[i];
            
            arr[i] = arr[j];
            
            arr[j] = temp;
            
            i++;
            
            j--;
        }
        
        return new String(arr);
    }
    public String reverseWords(String s) {
        
        
       String[] words = s.strip().split("\\s+");
       
       StringBuilder ans = new StringBuilder();
       
       int n = words.length;
       
       for(int i = 0; i < n; i++){
           
           String reversed = reverseString(words[i]);
           
           ans.append(reversed);
           
           if(i != n - 1){
               ans.append(" ");
           }
       }
       
       return ans.toString();
    }
}
