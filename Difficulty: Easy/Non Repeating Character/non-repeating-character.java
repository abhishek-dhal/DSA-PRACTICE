class Solution {
    public char nonRepeatingChar(String s) {
        // code here
        
        int[] freq = new int[26];
        
        int n = s.length();
        
        for(int i = 0;i<n;i++){
            char ch = s.charAt(i);
            freq[ch - 'a']++;
        }
        
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            
            if(freq[ch - 'a'] == 1) return ch;
        }
        
        return '$';
       
        
        
    }
}
