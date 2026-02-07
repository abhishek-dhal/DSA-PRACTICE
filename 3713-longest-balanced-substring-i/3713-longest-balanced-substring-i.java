class Solution {
    public int longestBalanced(String s) {
        
        int n = s.length();

        int maxLen = 1;

        for(int i = 0; i < n; i++){

            int[] freq = new int[26];
            for(int j = i; j < n; j++){
                freq[s.charAt(j) - 'a']++;

                if(checkBalanced(freq)){
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }

        return maxLen;
        
    }

    private boolean checkBalanced(int[] freq){

        int comman = 0;
        for(int i = 0;i < 26;i++){
            
            if(freq[i] == 0) continue;

            if(comman == 0){
                comman = freq[i];
            }
            else if(freq[i] != comman){
                return false;
            }
        }
        return true;
    }
}