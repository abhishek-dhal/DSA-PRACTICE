// User function Template for Java

class Solution {
    
   static boolean isOperator(Character ch){
        if(ch == '*' || ch == '-' || ch == '+' || ch == '/' || ch == '^'){
            return true;
        }
        return false;
    }
    static String postToPre(String post_exp) {
        
        Stack<String> st = new Stack<>();
        
        int n = post_exp.length();
        
        for(int i=0;i<n;i++){
            
            char ch = post_exp.charAt(i);
            
            if(isOperator(ch)){
                
                if(st.isEmpty()) return "";
                
                String op1 = st.peek();
                
                st.pop();
                
                String op2 = st.peek();
                
                st.pop();
                
                String string = ch + op2 + op1;
                
                st.push(string);
            }
            
            else{
                st.push(ch + "");
            }
        }
        
       
        
        return st.peek();
        
        
        
        
    }
}
