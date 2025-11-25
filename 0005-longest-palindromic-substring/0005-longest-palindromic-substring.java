class Solution {
    private int longestPalStart = 0;
    private int maxLen = 0;

    private  void expandAndTrack(String s,int left,int right){

        int n = s.length();

        while(left>=0 && right<n && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }


        int currentLength = right-left-1;

        if(currentLength > maxLen){
            maxLen = currentLength;

            longestPalStart = left+1;
        }
    }
    public String longestPalindrome(String s) {
        int n = s.length();

        if(s == null || n<2) return s;

       for(int i=0;i<n;i++){
        expandAndTrack(s,i,i);
        expandAndTrack(s,i,i+1);
       }

       return s.substring(longestPalStart,longestPalStart+maxLen);
    }
}