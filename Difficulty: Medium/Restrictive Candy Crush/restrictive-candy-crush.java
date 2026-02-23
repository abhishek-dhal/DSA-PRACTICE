// User function Template for Java

/*
    Note: Use StringBuilder/StringBuffer class for String concatenation(if any).
    While using String class, on each concatenation a new copy of the string is created,
   so that the overall complexity is O(n^2) . Fortunately in Java we could solve this
   with a StringBuffer/StringBuffer, which has O(1) complexity for each append.
*/
class Pair{
    
    Character ch;
    int cnt;
    
    Pair(Character ch,int cnt){
        this.ch = ch;
        this.cnt = cnt;
    }
    
    
}
class Solution {
    public static String reduced_String(int k, String s) {
        // Your code goes here
        
        
        int n = s.length();
        
        if(k == 1) return "";
        
         Stack<Pair> st = new Stack<>();
         
         for(char c: s.toCharArray()){
             
             
             if(st.isEmpty() || st.peek().ch != c){
                 st.push(new Pair(c,1));
             }
             
             else{
                 
                 st.peek().cnt++;
                 
                 if(st.peek().cnt == k){
                     st.pop();
                 }
             }
         }
         
         StringBuilder ans = new StringBuilder();
         
         for(Pair p: st){
             for(int i = 0; i < p.cnt; i++){
                 ans.append(p.ch);
             }
         }
         
         return ans.toString();
         
         
        
        
    }
}