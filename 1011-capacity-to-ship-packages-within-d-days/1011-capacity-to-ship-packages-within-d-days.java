class Solution {
    public long findMaxi(int[] weights){
        long largest = weights[0];

        for(int w:weights){
            if(w > largest){
                largest = w;
            }
        }
        return largest;
    }
    public long addW(int[] weights){
        int n = weights.length;
        long sumW = 0;
        for(int w:weights){
            sumW += w;
        }
        return sumW;
    }
    //tricky part ,crucial
    public boolean isPossible(long m,int[] weights,int days){
        int n = weights.length;
        
        int curr_weight = 0;
        int day_track = 1;

        for(int w:weights){
            if(w > m){
                return false;
            }
            else if(w + curr_weight <= m){
                curr_weight += w;
            }
            else{
                day_track++;
                curr_weight = w;
            }
        }
        if(day_track > days) return false;

        return true;

    }
    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        long maxi = addW(weights);

        long low=findMaxi(weights);
        long high=maxi;
        long ans=-1;

        while(low<=high){
            long mid = low + (high-low)/2;

            boolean f = isPossible(mid,weights,days);

            if(f){
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