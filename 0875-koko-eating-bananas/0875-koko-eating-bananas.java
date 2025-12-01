class Solution {
    public int findMaxI(int[] piles){
        int n=piles.length;

        int j = 0;
        for(int i=1;i<n;i++){
            if(piles[i] > piles[j]){
                j=i;
            }
        }
        return j;
    }
    public long timeCalc(int[] piles,long x){
        int n=piles.length;
        long sumT = 0;

        for(int i=0;i<n;i++){
            long val = (piles[i] + x - 1)/x;
            sumT += val;
        }
        return sumT;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int mIndex = findMaxI(piles);

        long low=1;
        long high=piles[mIndex];
        long ans=-1;

        while(low<=high){

            long mid = low + (high-low)/2;

            long c = timeCalc(piles,mid);

            if(c <= h){
                ans=mid;
                high=mid-1;
            }
            else if(c > h){
                low=mid+1;
            }
        }

        return (int)ans;
    }
}