class Solution {
    public int getMinDiff(int[] arr, int k) {
        // code here
        
        // int n = arr.length;
        
        // int maxi = Integer.MIN_VALUE;
        
        // int mini = Integer.MAX_VALUE;
        
        // for(int i = 0; i < n; i++){
            
        //     if(arr[i] > maxi){
                
        //         maxi = arr[i];
        //     }
            
        //     if(arr[i] < mini){
        //         mini = arr[i];
        //     }
        // }
        
        
        // int minDiff = (maxi - k) - (mini + k);
        
        
        // return minDiff < 0 ? maxi - mini : minDiff;
        
        
        
        
        
    



        int n = arr.length;

        Arrays.sort(arr);

        // initial difference (no modification)
        int ans = arr[n-1] - arr[0];

        int small = arr[0] + k;
        int big   = arr[n-1] - k;

        for(int i = 0; i < n-1; i++){

            int mini = Math.min(small, arr[i+1] - k);
            int maxi = Math.max(big, arr[i] + k);

            // height cannot be negative
            if(mini < 0) continue;

            ans = Math.min(ans, maxi - mini);
        }

        return ans;

    }
}
