class Solution {
    public int cntElements(int target,int[][] mat){
        int n = mat.length;
        int m = mat[0].length;
        
        int cnt = 0;
        
        //traverse each row
        for(int i=0;i<n;i++){
            int low = 0;
            int high = m-1;
            
            // Binary search in current row (row is sorted)
            while(low <= high){
                
                int mid = low + (high - low)/2;
                
                if(mat[i][mid] <= target){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
               
            }
             cnt += low;
        }
       
        return cnt;
         // After binary search:
         // low = index of first element > target
        // which is equal to count of elements <= target in this row
        
        
    }
    public int median(int[][] mat) {
        
        int n = mat.length;
        int m = mat[0].length;
        
        int low = Integer.MAX_VALUE;
        
        int high = Integer.MIN_VALUE;
        
        
        //traverse first row and last row and find min and max
        for(int i = 0;i<n;i++){
            low = Math.min(low,mat[i][0]);
            high = Math.max(high,mat[i][m-1]);
        }
        
       
        
        while(low < high){
            int mid = low + (high - low)/2;
            
            // Count elements <= mid
            int cnt = cntElements(mid,mat);
            
            // If count is less than or equal to median index,
            // median must be greater
            if(cnt <= n*m/2) {
                low = mid + 1;
            }
            // Otherwise median is <= mid
            else{
                high = mid;
            }
            
        }
        
         // low == high is the median
        return low;
        
    }
}