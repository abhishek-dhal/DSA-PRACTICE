class Solution {
    public int n;
    public boolean isPossible(double mid,int[] stations,int k){
        
        if(mid == 0) return false;
        int required = 0;
        
        for(int i=1;i<n;i++){
            double gap = stations[i] - stations[i-1];
            int add = (int)Math.ceil(gap/mid) - 1;
            
            required += add;
        }
        
        return required <= k;
    }
    public double minMaxDist(int[] stations, int K) {
        n = stations.length;
        Arrays.sort(stations);
        
        double s = 0;
        double e = 0;
        
        //e is max gap
        for(int i=1;i<n;i++){
            e = Math.max(e,stations[i] - stations[i-1]);
        }
        
        double epsilon = 1e-6;
    
        
        while(e-s > epsilon){
            double mid = s + (e-s)/2;
            
            if(isPossible(mid,stations,K)){
                
                e = mid;
            }
            else{
                s = mid;
            }
        }
        
        return e;
        
        
    }
}
