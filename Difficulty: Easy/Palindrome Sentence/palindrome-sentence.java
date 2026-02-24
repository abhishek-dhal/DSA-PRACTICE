class Solution {
    
    public boolean isPalinSent(String s) {
        // code here
        
        int n = s.length();
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < n;i++){
            char ch = s.charAt(i);
            
            if(ch >= 'A' && ch <= 'Z'){
                char t = Character.toLowerCase(ch);
                sb.append(t);
            }
            else if(ch >= 'a' && ch <= 'z'){
                sb.append(ch);
            }
            else if(ch >= '0' && ch <= '9'){
                sb.append(ch);
            }
        }
        
        String str = sb.toString();
        
        int i = 0;
        
        int j = str.length() - 1;
        
        while(i < j){
            
            char front = str.charAt(i);
            
            char back = str.charAt(j);
            
            
            if(front != back) return false;
            
            i++;
            j--;
        }
        
        return true;
    }
}