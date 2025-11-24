class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen=0;
        int left=0;
        HashMap<Character,Integer> map = new HashMap<>();
        int n=s.length();

        for(int right=0;right<n;right++){
            map.put(s.charAt(right),map.getOrDefault(s.charAt(right),0)+1);

            while(map.get(s.charAt(right)) > 1){
                char leftChar = s.charAt(left);
                map.put(leftChar,map.get(leftChar)-1);
                left++;
            }
            maxLen = Math.max(maxLen,right-left+1);
           
        }

        return maxLen;
    }
}