class Solution {
    public int atMost(String s,int k){
         int n = s.length();
        
        HashMap<Character,Integer> map = new HashMap<>();
        
       int st = 0;
       
       int cnt = 0;
       
       for(int e = 0; e < n; e++){
           char ch = s.charAt(e);
           
           map.put(ch,map.getOrDefault(ch,0)+1);
           
           while(map.size() > k){
               map.put(s.charAt(st),map.getOrDefault(s.charAt(st),0)-1);
               
               
               
               if(map.get(s.charAt(st)) == 0){
                   map.remove(s.charAt(st));
               }
               
               st++;
           }
           
          
              cnt += e - st + 1;
          
       }
       
       return cnt;
    }
    public int countSubstr(String s, int k) {
        //  code here
        
        return atMost(s,k) - atMost(s,k-1);
       
    }
}