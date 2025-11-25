class Solution {
    public int minSwaps(String s) {
        int n=s.length();
        //for trackig unmatched opening
        int cnt=0;
        

        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            if(c == '['){
                cnt++;

            }
            else if( c == ']'){
                if(cnt > 0){
                    cnt--;
                }
            }
        }

        return (cnt + 1)/2;
    }
}