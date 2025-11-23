class Solution {
    boolean isPalindrome(String s) {
        int n=s.length();
        
        if(n==1) return true;
        
        boolean flag=true;
        
        int f=0;
        int l=n-1;
        while(f<l){
            if(s.charAt(f) != s.charAt(l) ){
                flag=false;
                break;
            }
            f++;
            l--;
        }
        
        return flag;
        
    }
}