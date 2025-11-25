class Solution {
    public boolean rotateString(String s, String goal) {
        int n = s.length();
        int m = goal.length();

        if(n != m ) return false;
        
        String doubleS = s + s;

        if(doubleS.contains(goal)){
            return true;
        }

        return false;

        
    }
}