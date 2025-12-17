class Solution {
    int maxLength(int arr[]) {
        
        int n = arr.length;
       HashMap<Integer,Integer> prefix = new HashMap<>();
       
       int maxLen = 0;
       int sum = 0;
       
       for(int i=0;i<n;i++){
           sum = sum + arr[i];
           
           if(sum == 0){
               maxLen = i+1;
           }
           
           int rem = sum;
           
           if(prefix.containsKey(rem)){
               int val = prefix.get(rem);
               maxLen = Math.max(maxLen,i-val);
           }
           
           if(!prefix.containsKey(sum)){
               prefix.put(sum,i);
           }
       }
       
       return maxLen;
        
    }
}