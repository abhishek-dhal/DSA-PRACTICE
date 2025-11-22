class Solution {
    public int myAtoi(String s) {
        int len = s.length();
        int i=0;
        while(i<len && s.charAt(i) == ' '){
            i++;
        }

        if(i == len){
            return 0;
        }

        int sign=1;
        if(s.charAt(i) == '-'){
                sign=-1;
                i++;
        }
        else if(s.charAt(i) == '+'){
                i++;
        }

        int res=0;
        while(i<len){
            char c = s.charAt(i);

            if( c < '0' || c > '9'){
                break;
            }

            int digit = c - '0';

            if(res > Integer.MAX_VALUE/10 || res == Integer.MAX_VALUE/10 && digit >7){
                return (sign == 1)?Integer.MAX_VALUE:Integer.MIN_VALUE;
            }

            res = res*10+digit;
            i++;
        }


        return res*sign;
        


        
        
    }
}