class Solution {

    public static boolean isMatch(int sMap[],int tMap[]){
        
        for(int i=0;i<128;i++){
            if(tMap[i] > sMap[i]){
                return false;
            }
        }

        return true;
    }
    public String minWindow(String s, String t) {
        int n1=s.length();
        int n2=t.length();

        if(n1<n2) return "";
        int ans=Integer.MAX_VALUE;

        int[] sMap = new int[128];
        int[] tMap = new int[128];

        for(char c: t.toCharArray()) tMap[c]++;

        int left=0;
        int startHead=0;
        int minLen = Integer.MAX_VALUE;

        for(int right=0;right<n1;right++){

            char c = s.charAt(right);
            sMap[c]++;
           

            while(isMatch(sMap,tMap)){
                
                if(right-left+1 < minLen){
                    minLen = right-left+1;
                    startHead=left;
                }

                char leftChar = s.charAt(left);
                sMap[leftChar]--;
                left++;
            }


        }

        return (minLen == Integer.MAX_VALUE) ? "" : s.substring(startHead,startHead+minLen);
    }
}