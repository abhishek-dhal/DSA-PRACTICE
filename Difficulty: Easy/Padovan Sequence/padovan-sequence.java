// User function Template for Java

class Solution {
    public int padovanSequence(int n) {
        // code here.
        
        
        int MOD = 1000000007;
        
        long[] pd = new long[n+1];
        
        if(n <= 2) return 1;
        
        pd[0] = pd[1] = pd[2] = 1;
        
        for(int i = 3; i <= n; i++){
            
            pd[i] = (pd[i-2] + pd[i-3]) % MOD;
        }
        
        return (int)pd[n];
    }
}
