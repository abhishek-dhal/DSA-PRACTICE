class Solution {
    public int scoreOfParentheses(String s) {
        int n=s.length();
        int cnt=0;
        int ans=0;

        for(int i=0;i<n;i++){
            char c = s.charAt(i);

            if(c == '('){
                cnt++;
            }
           else{
            cnt--;
            
            if(s.charAt(i-1) == '('){
                ans = ans + (int)Math.pow(2,cnt);
            }
           }
        }
     return ans;   
    }
}