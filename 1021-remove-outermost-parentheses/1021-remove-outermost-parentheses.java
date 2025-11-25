class Solution {
    public String removeOuterParentheses(String s) {
        int n = s.length();
        StringBuilder ans = new StringBuilder();

        int cnt=0;
        for(int i=0;i<n;i++){

            char c = s.charAt(i);
            
            if(c == '('){
                
                if(cnt > 0){
                    ans.append(c);
                }
                cnt++;
            }

            else if(c == ')'){
                cnt--;
                if(cnt > 0){
                    ans.append(c);
                }
            }
        }

        return ans.toString();
    }
}