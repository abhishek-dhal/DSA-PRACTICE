class Solution {
    private final long mod = 1_000_000_007L;
    private long findPow(long a,long b){
        if(b == 0) return 1;

        long  res = 1L;

        long half = findPow(a,b/2);
        res = (half * half)%mod;

        if(b % 2 == 1){
            res =( res * a)%mod;
        }
        return res;

    }
    public int countGoodNumbers(long n) {

        long evenChoice = (n+1)/2;
        long oddChoice = n/2;

        long evenHalf = findPow(5,evenChoice);
        long oddHalf = findPow(4,oddChoice);

        long ans = (evenHalf * oddHalf)%mod;

        return (int)ans;
        
    }
}