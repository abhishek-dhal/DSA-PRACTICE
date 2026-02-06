// User function Template for Java
class Solution {
    String transform(String S) {
        // code here
        
        int n = S.length();
        
        StringBuilder ans = new StringBuilder();
        
        char prev = Character.toLowerCase(S.charAt(0));
        
        int cnt = 1;
        
        for(int i = 1; i < n ;i++){
            
            char curr = Character.toLowerCase(S.charAt(i));
            
            if(curr == prev){
                cnt++;
            }
            
            else{
                ans.append(cnt).append(prev);
                prev=curr;
                cnt=1;
            }
        }
        
        //last character
        ans.append(cnt).append(prev);
        
        return ans.toString();
        
    }
}