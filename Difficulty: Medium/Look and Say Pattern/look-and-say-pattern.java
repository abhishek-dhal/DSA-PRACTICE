class Solution {
    public String countAndSay(int n) {
        // code here
        
        // String[] ans = new String[n+1];
        
        // ans[0] = "1";
        
        // for(int i = 1; i <= n; i++){
            
        //     String req = ans[i-1];
            
        //     HashMap<Character,Integer> count = new HashMap<>();
            
        //     for(int j = 0; j < req.length(); j++){
                
        //         char c = req.charAt(j);
                
        //         count.put(c,count.getOrDefault(c,0)+1);
        //     }
            
        //     StringBuilder sb = new StringBuilder();
            
        //     for(Character key : count.keySet()){
        //         sb.append(count.get(key));
        //         sb.append(key);
        //     }
            
        //     ans[i] = sb.toString();
        // }
        
        // return ans[n];
        
        
        
        
        
        String res = "1";
        
        for(int i = 2; i <= n; i++){
            
            StringBuilder sb = new StringBuilder();
            
            int cnt = 1;
            
            for(int j = 1; j < res.length(); j++){
                
                if(res.charAt(j) == res.charAt(j-1)){
                    cnt++;
                }
                else{
                    sb.append(cnt);
                    sb.append(res.charAt(j-1));
                    cnt = 1;
                }
            }
            
            sb.append(cnt);
            sb.append(res.charAt(res.length()-1));
            
            res = sb.toString();
        }
        
        return res;
    }
}
