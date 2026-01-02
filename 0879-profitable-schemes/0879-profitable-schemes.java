class Solution {

    // static final int MOD = 1_000_000_007;

    // static int[] group, profit;
    // static int minProfit;
    // static int m;

    public int profitableSchemes(int n, int minProfit, int[] group, int[] profit) {
        // this.group = group;

        // this.profit = profit;

        // this.minProfit = minProfit;

        // this.m = group.length;

        // return solve(0,n,0);



        //Tabulation Approach

        int MOD = 1_000_000_007;
        int[][] dp = new int[n+1][minProfit + 1];

        //Base Case
        dp[0][0] = 1;

         // Process each crime
         for(int i=0;i<group.length;i++){
            int members = group[i];
            
            int earn = profit[i];

             // Reverse loops (0/1 knapsack)

             for(int j = n; j >= members; j--){
                for(int k = minProfit; k >= 0; k--){

                    int newProfit = Math.min(minProfit, k + earn);

                    dp[j][newProfit] = (dp[j][newProfit] + dp[j - members][k]) % MOD;
                }
             }
         }

         // Count valid schemes
         int ans = 0;
         
         for(int j = 0; j <= n ; j++){
            ans = (ans + dp[j][minProfit] ) % MOD;
         }

         return ans;



    }

    // public static int solve(int ind,int membersLeft,int profitSoFar){

    //     //base case
    //     if(ind == m){
    //         return profitSoFar >= minProfit ? 1 : 0;
    //     }

    //     int ways = 0;

    //     //skip the crime

    //     ways = solve(ind+1,membersLeft,profitSoFar);

    //     //take the crime

    //    if(membersLeft >= group[ind]){
    //     ways = (ways + solve(ind+1,membersLeft - group[ind],Math.min(minProfit,profitSoFar + profit[ind]))) % MOD;
    //    }
    //    return ways;
    // }

   
}