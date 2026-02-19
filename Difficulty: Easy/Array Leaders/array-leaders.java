class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        
        
        int n = arr.length;
        
        // boolean isYes = true;
        
        int maxi = arr[n-1];
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int i = n - 1; i >= 0; i--){
            
             maxi = Math.max(maxi,arr[i]);
            
            if(maxi == arr[i]) ans.add(arr[i]);
            
           
        }
        
      Collections.reverse(ans);
      
      return ans;
    }
}
