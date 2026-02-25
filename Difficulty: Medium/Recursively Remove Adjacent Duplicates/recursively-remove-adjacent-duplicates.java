class Solution {

    
    public String removeS(int i, StringBuilder sb, String s){

       if(i == s.length()){
           
           return sb.toString();
       }

        if( i + 1 < s.length() && s.charAt(i) == s.charAt(i+1)){
            
            char ch = s.charAt(i);
            
            while( i < s.length() && s.charAt(i) == ch){
                i++;
            }
            
            return removeS(i,sb,s);
        }
        
        else{
            sb.append(s.charAt(i));
            
            return removeS(i+1,sb,s);
        }
    }

    public String removeUtil(String s) {

        String result = removeS(0, new StringBuilder(), s);

        
        if(result.equals(s)) {
            return result;
        }

        
        return removeUtil(result);
    }
}