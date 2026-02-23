class Solution {
    public int longestUniqueSubstr(String s) {
        // code here
        
        int n = s.length();
        
        if(n == 0 || n == 1) return n;
        
        boolean[] vis = new boolean[26];
        
        int len = 0;
        
        int l = 0;
        
        int r = 0;
        
        while(r < n){
            
            while(vis[s.charAt(r) - 'a'] == true){
                
                vis[s.charAt(l) - 'a'] = false;
                l++;
            }
            
            vis[s.charAt(r) - 'a'] = true;
            
            len = Math.max(len,r - l + 1);
            
            r++;
            
            
        }
        
        return len;
    }
}