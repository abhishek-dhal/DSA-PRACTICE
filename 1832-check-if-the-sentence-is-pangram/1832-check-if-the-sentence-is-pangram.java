class Solution {
    public boolean checkIfPangram(String sentence) {
        
        int[] letter = new int[26];

        int n = sentence.length();

        for(int i = 0;i<n;i++){
            char c = sentence.charAt(i);

            letter[c - 'a']++;
        }

        for(int i=0;i<26;i++){
            if(letter[i] == 0) return false;
        }

        return true;
    }
}