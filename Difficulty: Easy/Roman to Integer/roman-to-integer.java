class Solution {
    public int romanToDecimal(String s) {
        // code here
        
        int n = s.length();
        
        HashMap<Character,Integer> m = new HashMap<>();
        
        m.put('I',1);
        m.put('V',5);
        m.put('X',10);
        m.put('L',50);
        m.put('C',100);
        m.put('D',500);
        m.put('M',1000);
        
        
        int res = 0;
        
        for(int i = 0; i < n; i++){
            
            char c = s.charAt(i);
            
            if(i + 1 < n && m.get(s.charAt(i+1)) > m.get(s.charAt(i))){
                res += m.get(s.charAt(i+1)) - m.get(s.charAt(i));
                
                i++;
            }
            else{
                res += m.get(s.charAt(i));
            }
            
            
        }
        
        return res;
    }
}