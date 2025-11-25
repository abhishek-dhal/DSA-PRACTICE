class Solution {
    public boolean isIsomorphic(String s, String t) {
        int n = s.length();
        int m = t.length();

        if(n != m) return false;

        HashMap<Character,Character> sMap = new HashMap<>();
        HashMap<Character,Character> tMap = new HashMap<>();

        for(int i=0;i<n;i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if(sMap.containsKey(c1)){
                if(sMap.get(c1) != c2){
                    return false;
                }
            }

            if(tMap.containsKey(c2)){
                if(tMap.get(c2) != c1){
                    return false;
                }
            }


            sMap.put(c1,c2);
            tMap.put(c2,c1);
        }

        return true;
    }
}