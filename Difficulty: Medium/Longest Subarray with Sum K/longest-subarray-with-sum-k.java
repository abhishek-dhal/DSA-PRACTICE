// User function Template for Java

class Solution {
    public int longestSubarray(int[] arr, int k) {
        
        int n = arr.length;
        long target =k;
        int maxLen=0;
        long currSum = 0;
        
        HashMap<Long,Integer> map = new HashMap<>();
        
        map.put(0L,-1);
        
        for(int i=0;i<n;i++){
            currSum = currSum + arr[i];
            
            long tarPrefix = currSum - target;
            
            if(map.containsKey(tarPrefix)){
                int currLength = i - map.get(tarPrefix);
                maxLen = Math.max(maxLen,currLength);
            }
            
            if(!map.containsKey(currSum)){
                map.put(currSum,i);
            }
        }
        
        return maxLen;
        
        
    }
}
