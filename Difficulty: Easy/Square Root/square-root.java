class Solution {
    int floorSqrt(int n) {
        
        
        if(n == 1) return 1;
        int low=1;
        int high=n-1;
        int ans=-1;
        
        while(low<=high){
            int mid = low + (high-low)/2;
            
            if(mid*mid == n){
                return mid;
            }
            else if(mid*mid > n){
                high=mid-1;
                if(mid*mid < n){
                    ans=mid;
                }
            }
            else{
                low=mid+1;
                if(mid*mid < n){
                    ans=mid;
                }
            }
        }
        
        return ans;
    }
}