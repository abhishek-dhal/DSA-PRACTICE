class Solution {
    
    static Boolean isAv(int i,int s,int[] arr,int sum, Boolean[][] dp){
        
        if(s == sum) return true;
        
        if(i == arr.length ) return false;
        
        if(dp[i][s] != null) return dp[i][s];
        
        boolean take = false;
        
       if(s + arr[i] <= sum){
           take = isAv(i+1, s + arr[i], arr, sum, dp);
            }
        
        boolean skip = isAv(i+1,s,arr,sum,dp);
        
        
        dp[i][s] =  take || skip;
        
        return dp[i][s];
        
    }

    static Boolean isSubsetSum(int arr[], int sum) {
        // code here
        
        int n = arr.length;
        
        Boolean[][] dp = new Boolean[n][sum+1];
        
        return isAv(0,0,arr,sum,dp);
    }
}