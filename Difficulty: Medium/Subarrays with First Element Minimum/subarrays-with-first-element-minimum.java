class Solution {
    
    int[] NSE(int[] arr){
        int n = arr.length;
        
        int[] nse = new int[n];
        
        Stack<Integer> s = new Stack<>();
        
        for(int i = n - 1; i >= 0; i--){
            
            while(!s.isEmpty() && arr[i] <= arr[s.peek()]){
                s.pop();
            }
            
            nse[i] = s.isEmpty() ? n : s.peek();
            
            s.push(i);
        }
        
        return nse;
        
    }
    public int countSubarrays(int[] arr) {
        
        Stack<Integer> s = new Stack<>();
        
       
        
        int[] nse = NSE(arr);
        
        
        int cnt = 0;
        
        int n = arr.length;
        
        for(int i = 0; i < n;i++){
            cnt += ( nse[i] - i);
        }
        
        return cnt;
        
        
        
    }
}
