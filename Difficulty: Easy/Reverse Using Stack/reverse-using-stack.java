class Solution {
    public String reverse(String S) {
        
        Stack<Character> st = new Stack<>();
        
        StringBuilder ans = new StringBuilder();
        
        for(char c : S.toCharArray()){
            st.push(c);
        }
        
        while(!st.isEmpty()){
            ans.append(st.pop());
        }
        
        return ans.toString();
        
    }
}