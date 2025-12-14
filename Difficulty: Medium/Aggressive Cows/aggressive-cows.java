class Solution {
    public int n;
    public boolean isPossible(int mid,int[] stalls,int k){
        int cowCnt = 1;
        int lastPos = stalls[0];
        
        for(int i=0;i<n;i++){
            if(stalls[i] - lastPos >= mid){
                cowCnt++;
                lastPos = stalls[i];
            }
            if(cowCnt == k) {
                return true;
            }
            
        }
        return false;
    }
    public int aggressiveCows(int[] stalls, int k) {
        n = stalls.length;
        
        int maxi = stalls[0];
        
        for(int i=1;i<n;i++){
            if(stalls[i] > maxi){
                maxi = stalls[i];
            }
        }
        
        int s =0;
        int e = maxi;
        int ans=-1;
        
        Arrays.sort(stalls);
        
        while(s<=e){
            int mid = s + (e-s)/2;
            
            if(isPossible(mid,stalls,k)){
                ans = mid;
                s = mid+1;
            }
            else{
                e = mid-1;
            }
        }
        
        return ans;
        
    }
}