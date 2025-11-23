class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int n=s.length();

        int left=0;
        int currentCost=0;
        int maxLen=0;

        for(int right=0;right<n;right++){
             int cost = Math.abs(s.charAt(right) - t.charAt(right));
             currentCost = currentCost+cost;

             while(currentCost > maxCost){
                int removeCost =  Math.abs(s.charAt(left) - t.charAt(left));
                currentCost = currentCost - removeCost;
                left++;
             }

             maxLen = Math.max(maxLen,right-left+1);
        }


        return maxLen;
    }
}