class Solution {
    public boolean isPalindrome(String s) {
        int n=s.length();
        boolean flag=true;
        int f=0;
        int l=n-1;

        while(f<l){
            char lChar=s.charAt(f);
            char rChar=s.charAt(l);

            if(!Character.isLetterOrDigit(lChar)){
                f++;
            }
            else if(!Character.isLetterOrDigit(rChar)){
                l--;
            }

            else{
                if(Character.toLowerCase(lChar) != Character.toLowerCase(rChar)){
                    flag=false;
                    break;
                }

                 f++;
            l--;
            }

           
        }

        return flag;

    }
}