class Solution {
    public int characterReplacement(String s, int k) {

        int[] count = new int[26];
        int maxEl = 0;
        int maxLen=0;
        int left=0;

        int n=s.length();

        for(int right=0;right<n;right++){
            int index=s.charAt(right) - 'A';
            count[index]++;

            
            maxEl = Math.max(maxEl,count[index]);

           
          

            while( (right-left+1) - maxEl > k){
                int leftIndex = s.charAt(left) - 'A';
                count[leftIndex]--;
                left++;
            }

            maxLen = Math.max(maxLen,right-left+1);
        }

        return maxLen;
    }
}