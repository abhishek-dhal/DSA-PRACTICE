// User function Template for Java

class Sol {
    int closing(String s, int pos) {
        // your code here
        
        
        Stack<Integer> st = new Stack<>();
        
        int n = s.length();
        
        
        for(int i = 0; i < n; i++){
            
            char ch = s.charAt(i);
            
            if(ch != '[' && ch != ']') continue;
            
            if(ch == '['){
                st.push(i);
            }
            
            
            
            else{
                
                int openIndex = st.pop();
                
                if(openIndex == pos){
                    return i;
                }
                
                
            }
        }
        
        return -1;
    }
}