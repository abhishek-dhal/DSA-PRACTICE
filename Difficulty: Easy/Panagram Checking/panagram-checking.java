class Solution {
    public static boolean checkPangram(String s) {
        // code here
        
        int[] map = new int[26];
        
        int n = s.length();
        
        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);
            
            char l = Character.toLowerCase(ch);
            
            if(l >= 'a' && l <= 'z'){
                
                map[l - 'a']++;
            }
            
            
            
            
        }
        
        for(int i = 0; i < 26; i++){
            if(map[i] == 0) return false;
        }
        
        return true;
    }
}