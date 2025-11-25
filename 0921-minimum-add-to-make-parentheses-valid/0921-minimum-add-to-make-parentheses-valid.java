class Solution {
    public int minAddToMakeValid(String s) {
        int n=s.length();
        int cnt=0;
        int move=0;
        for(int i=0;i<n;i++){
            char c = s.charAt(i);

            if(c == '('){
                cnt++;
            }
            else if(c == ')'){
                if(cnt > 0){
                    cnt--;
                }
                else{
                    move++;
                }
            }
        }

        return cnt + move;
    }
}