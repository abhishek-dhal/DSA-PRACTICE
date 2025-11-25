class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        int m = t.length();
        if(n != m) return false;

        int[] sMap = new int[26];
        int[] tMap = new int[26];

        for(int i=0;i<n;i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            sMap[c1 - 'a']++;
            tMap[c2 - 'a']++;
        }

        for(int i=0;i<26;i++){
            if(sMap[i] != tMap[i]){
                return false;
            }
        }

        return true;
    }
}