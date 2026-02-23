class Solution {
    // static boolean isValid(String s){
        
    //     Stack<Character> st = new Stack<>();

    // for(char c : s.toCharArray()){

    //     if(c == '('){
    //         st.push(c);
    //     }
    //     else{
    //         if(st.isEmpty()) return false;

    //         if(st.peek() == '('){
    //             st.pop();
    //         }
    //     }
    // }

    // return st.isEmpty();
    // }
    static int maxLength(String s) {
        
       Stack<Integer> st = new Stack<>();
        st.push(-1);  // base index

        int maxLen = 0;

        for(int i = 0; i < s.length(); i++) {

            if(s.charAt(i) == '(') {
                st.push(i);
            }
            else {
                st.pop();

                if(st.isEmpty()) {
                    st.push(i);
                } 
                else {
                    maxLen = Math.max(maxLen, i - st.peek());
                }
            }
        }
        return maxLen;
        
    }
}