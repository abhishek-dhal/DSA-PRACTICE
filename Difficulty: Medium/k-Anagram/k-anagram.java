class Solution {
    boolean areKAnagrams(String s1, String s2, int k) {
        // code here
        
        int n = s1.length();
        
        int m = s2.length();
        
        if(n != m) return false;
        
        int[] map = new int[26];
        
       
        
        for(int i = 0; i < n; i++){
            
            char c1 = s1.charAt(i);
            
            map[c1 - 'a']++;
           
        }
        
        for(int i = 0; i < m; i++){
            
            char c2 = s2.charAt(i);
            
           if(map[c2 - 'a'] > 0){
               map[c2 - 'a']--;
           }
           
        }
        
        int cnt = 0;
        
        for(int i = 0; i < 26; i++){
            
            if(map[i] > 0){
                cnt += map[i];
            }
        }
        
       
        
        
       return cnt <= k;
        
        
    }
}