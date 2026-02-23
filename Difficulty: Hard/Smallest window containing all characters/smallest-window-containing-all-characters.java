class Solution {
    public static String smallestWindow(String s, String p) {
        // code here
        
        int m = s.length();
        
        int n = p.length();
        
        if(n > m) return "";
        
        int[] vis1 = new int[26];
        
        int[] vis2 = new int[26];
        
        for(int i = 0; i < n; i++){
            
            char ch = p.charAt(i);
            
            vis2[ch - 'a']++;
        }
        
        int start = 0;
        
        int sIndex = -1;
        
        int minLen = Integer.MAX_VALUE;
        
        int cnt = 0;
        
        for(int e = 0; e < m; e++){
            
            char ch = s.charAt(e);
            
            vis1[ch - 'a']++;
            
            if(vis2[ch - 'a'] != 0 && vis1[ch - 'a'] <= vis2[ch - 'a']){
                cnt++;
            }
            
            if(cnt == n){
                
                while(vis1[s.charAt(start) - 'a'] > vis2[s.charAt(start) - 'a'] || vis2[s.charAt(start) - 'a'] == 0){
                    
                    if(vis1[s.charAt(start) - 'a'] > vis2[s.charAt(start) - 'a']){
                        vis1[s.charAt(start) - 'a']--;
                    }
                    
                    start++;
                }
                
                if(e - start + 1 < minLen){
                
                minLen = e - start + 1;
                
                sIndex = start;
            }
            }
            
            
            
            
        }
        
        if(sIndex == -1) return "";
        
        return s.substring(sIndex,sIndex + minLen);
        
        
    }
}