class Solution {
    public int findWords(String s){
        int cnt = 0;

        int n = s.length();

        for(int i=0;i<n;i++){
            if(s.charAt(i) == ' ') cnt++;
        }

        return ++cnt;
    }
    public int mostWordsFound(String[] sentences) {
        
        int n = sentences.length;

        int maxi = 0;

        for(int i=0;i<n;i++){
            int words = findWords(sentences[i]);

            maxi = Math.max(maxi,words);
        }

        return maxi;
    }


}