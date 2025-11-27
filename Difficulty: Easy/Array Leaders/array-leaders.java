class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        int n=arr.length;
        ArrayList<Integer> ans = new ArrayList<>();
        
        
        int max_right=-1;
        
        for(int i=n-1;i>=0;i--){
           if(arr[i] >= max_right){
               ans.add(arr[i]);
               max_right = arr[i];
           }
        }
        
         Collections.reverse(ans);
         
         return ans;
    }
}
