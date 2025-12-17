// User function Template for Java

class Solution {
    // public int solve(int day,int last,int arr[][]){
    //     if(day == 0){
    //         int maxi = 0;
    //         for(int task=0;task<3;task++){
    //             if(task != last){
    //                 maxi = Math.max(maxi,arr[0][task]);
    //             }
    //         }
    //         return maxi;
    //     }
        
    //     int maxi = 0;
    //     for(int task=0;task<3;task++){
    //         if(task != last){
    //             int points = arr[day][task] + solve(day-1,task,arr);
    //             maxi = Math.max(maxi,points);
    //         }
    //     }
    //     return maxi;
        
    // }
    public int maximumPoints(int arr[][]) {
    //   int n = arr.length;
    //   return solve(n-1,3,arr);
    
    int n = arr.length;
    
    int[][] dp = new int[n][4];
    
    dp[0][0] = Math.max(arr[0][1],arr[0][2]);
    dp[0][1] = Math.max(arr[0][0],arr[0][2]);
    dp[0][2] = Math.max(arr[0][0],arr[0][1]);
    dp[0][3] = Math.max(arr[0][0],Math.max(arr[0][1],arr[0][2]));
    
    for(int day=1;day<n;day++){
        for(int last=0;last<4;last++){
            dp[day][last] = 0;
            for(int task=0;task<3;task++){
                if(task != last){
                    int points = arr[day][task] + dp[day-1][task];
                    dp[day][last] = Math.max(dp[day][last],points);
                }
            }
        }
    }
    return dp[n-1][3];
    
    
        
    }
}