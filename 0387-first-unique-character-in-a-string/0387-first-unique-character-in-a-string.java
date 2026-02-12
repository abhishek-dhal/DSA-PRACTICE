class Solution {
    public int firstUniqChar(String s) {
        
        int n = s.length();

        Map<Character,Integer> fMap = new HashMap<>();

        for(char c: s.toCharArray()){
            fMap.put(c,fMap.getOrDefault(c,0)+1);
        }

        for(int i =0;i<n;i++){
            if(fMap.get(s.charAt(i)) == 1){
                return i;
            }
        }

        return -1;

    }
}