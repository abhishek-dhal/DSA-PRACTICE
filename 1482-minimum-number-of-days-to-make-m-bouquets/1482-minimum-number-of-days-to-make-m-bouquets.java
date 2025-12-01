class Solution {
    public long findMax(int[] bloomDay){
        int n = bloomDay.length;
        long largest = bloomDay[0];

        for(long days: bloomDay){
            if(days > largest){
                largest=days;
            }
        }

        return largest;
    }
    public boolean isPossible(long day,int[] bloomDay,int m,int k){
        int n=bloomDay.length;
        long curr = 0;
        long total_bq = 0;

        for(int i=0;i<n;i++){
            if(bloomDay[i] <= day){
                curr++;
            }
            else{
                total_bq += curr/k;
                curr=0;
            }
        }
        total_bq += curr/k;

        return (total_bq >= m) ? true:false;

    }
    public int minDays(int[] bloomDay, int m, int k) {
        
        int n = bloomDay.length;

        //Edge case
        long required_flowers = m * k;
        if(required_flowers > n) return -1;
        long ans = -1;

        long maxi = findMax(bloomDay);

        long low=1;
        long high=maxi;

        while(low<=high){
            long mid = low+(high-low)/2;

            boolean res = isPossible(mid,bloomDay,m,k);

            if(res){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return (int)ans;
        
    }
}