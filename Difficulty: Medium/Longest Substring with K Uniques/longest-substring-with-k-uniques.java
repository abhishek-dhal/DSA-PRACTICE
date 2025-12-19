class Solution {
    public int longestKSubstr(String s, int k) {
        
        int n = s.length();
        
        HashMap<Character,Integer> map = new HashMap<>();
        
        int ans = -1;
        
        int left = 0;
        
        for(int right=0;right<n;right++){
            
            char c = s.charAt(right);
            
            map.put(c,map.getOrDefault(c,0)+1);
            
            while(map.size() > k){
                char ch = s.charAt(left);
                
                map.put(ch,map.getOrDefault(ch,0)-1);
                
                if(map.get(ch) == 0){
                    map.remove(ch);
                }
                left++;
            }
            
           if(map.size() == k){
                ans = Math.max(ans,right - left + 1);
           }
        }
        return ans;
    }
}