class Solution {
    
    public int nthSq(int num,int t){
        int ans=1;
        for(int i=0;i<t;i++){
            ans=ans*num;
        }
        return ans;
    }
    public int nthRoot(int n, int m) {
        // code here
        
        
        if(m == 1) return 1;
        if(n==1) return m;
        if(m == 0) return 0;
        
        int low=1;
        int high=m-1;
       
        
        while(low<=high){
            int mid=low+(high-low)/2;
            
            int val = nthSq(mid,n);
            
            if(val == m){
                return mid;
            }
            else if(val < m){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        
        return -1;
    }
}