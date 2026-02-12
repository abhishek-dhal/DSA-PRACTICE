class Solution {
    public boolean judgeCircle(String moves) {
        
        int n  = moves.length();

        int u = 0;

        int d = 0;

        int l = 0;

        int r = 0;

        for(int i=0;i<n;i++){
            char move = moves.charAt(i);

            if(move == 'U') u++;

            else if(move == 'D') d++;

            else if(move == 'L') l++;

            else r++;
        }

        if(u == d && l == r) return true;

        return false;
    }
}