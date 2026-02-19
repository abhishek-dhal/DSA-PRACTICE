class Solution {
    public List<List<Integer>> missingRanges(int[] arr, int lower, int upper) {
        // code here
        
         List<List<Integer>> ans = new ArrayList<>();
         
         int start = lower;
         
         for(int num : arr){
             
             if(start < num){
                 ans.add(Arrays.asList(start,num-1));
             }
             
             start = num + 1;
         }
         
         if(start <= upper){
             ans.add(Arrays.asList(start,upper));
         }
         
         return ans;
         
         
        
    }
}