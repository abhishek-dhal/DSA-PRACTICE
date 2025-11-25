class Solution {
    public String longestCommonPrefix(String[] strs) {

        StringBuilder ans = new StringBuilder();
        int n= strs.length;
        Arrays.sort(strs);

        String word1=strs[0];
        String word2 = strs[n-1];

        int left=0;

        while(left < word1.length() &&left < word2.length() && word1.charAt(left) == word2.charAt(left)){
            left++;
        }

        String prefix = word1.substring(0,left);

        ans.append(prefix);

        return ans.toString();

    }
}