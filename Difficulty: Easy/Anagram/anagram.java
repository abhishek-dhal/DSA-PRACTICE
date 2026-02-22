class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        
        int n1 = s1.length();
        
        int n2 = s2.length();
        
        if(n1 != n2) return false;
        
        int[] map1 = new int[26];
        
        int[] map2 = new int[26];
        
        for(int i = 0; i < n1; i++){
            
            char ch1 = s1.charAt(i);
            
            char ch2 = s2.charAt(i);
            
            map1[ch1 - 'a']++;
            
            map2[ch2 - 'a']++;
        }
        
        for(int i = 0; i < 26; i++){
            
            if(map1[i] != map2[i]){
                return false;
            }
        }
        
        return true;
        
    }
}