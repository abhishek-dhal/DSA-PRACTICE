class Solution {
    public String reverseWords(String s) {
        int n=s.length();
        int right=n-1;
        StringBuilder ans = new StringBuilder();

        while(right >= 0){
            //trailing out spaces at end
            while(right >= 0 && s.charAt(right) == ' '){
                right--;
            }

            if(right < 0) break;

            //We want word to append 
            int end = right;

            while(right >= 0 && s.charAt(right) != ' '){
                right--;
            }

            //Extract the word/substring

            String word = s.substring(right+1,end+1);

            if(ans.length() == 0){
                ans.append(word);
            }
            else{
                ans.append(' ').append(word);
            }
        }

        return ans.toString();
    }
}