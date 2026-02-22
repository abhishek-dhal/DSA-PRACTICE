// User function Template for Java
class Solution {
    long getSubstringWithEqual012(String str) {
        // code here
        
        int n = str.length();
        
        int cnt0 = 0;
        int cnt1 = 0;
        int cnt2 = 0;
        
        
        
        long ans = 0;
        
        HashMap<String,Integer> map = new HashMap<>();
        
        map.put("0#0",1);
        
        for(int i = 0; i < n; i++){
            
            char ch = str.charAt(i);
            
            if(ch == '0') cnt0++;
            else if(ch == '1') cnt1++;
            else cnt2++;
            
            int diff1 = cnt1 - cnt0;
            
            int diff2 = cnt2 - cnt1;
            
            String key = diff1 + "#" + diff2;
            
            if(map.containsKey(key)){
                ans += map.get(key);
            }
            
            map.put(key,map.getOrDefault(key,0)+1);
        }
        
        return ans;
    }
}