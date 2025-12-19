class Solution {
    public String minWindow(String s1, String s2) {
        //First find where the subsequence finishes,
        //then walk backward to shrink the window.
        
        int n = s1.length();
        int m = s2.length();
        
        if(m > n) return "";
        
        int i=0;
       
        int start = -1;
        int minLen = Integer.MAX_VALUE;
        
        while(i < n){
            int j = 0;
            
            //forward scan
            while(i<n){
                if(s1.charAt(i) == s2.charAt(j)){
                    j++;
                    if(j == m) break;
                }
                i++;
            }
            
            if(j < m) break; //no more window possible
            
            int end = i;
            
            //backward scan
            //to minimize the substring of s1 as possible 
            j = m - 1;
            
            while(j >= 0){
                if(s1.charAt(i) == s2.charAt(j)){
                    j--;
                }
                i--;
            }
            
            i++; //adjust to correct start
            
            if((end - i + 1) < minLen){
                minLen = end - i + 1;
                start = i;
            }
            i++;
            
        }
        return start == -1 ? "" : s1.substring(start,start+minLen);
    }
}
