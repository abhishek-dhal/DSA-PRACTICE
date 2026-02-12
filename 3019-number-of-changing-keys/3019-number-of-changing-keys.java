class Solution {
    public int countKeyChanges(String s) {
        

        int n = s.length();

        int cnt = 0;

        for(int i=1;i<n;i++){

            char first = s.charAt(i-1);

            char second = s.charAt(i);

            if(Character.toLowerCase(first) != Character.toLowerCase(second)) cnt++;
        }

        return cnt;
    }
}