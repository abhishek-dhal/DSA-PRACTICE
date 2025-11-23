class Solution {
    public static int findSum(int n) {
        
      if(n==1) return 1;
        
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        
        return sum;
    }
}
