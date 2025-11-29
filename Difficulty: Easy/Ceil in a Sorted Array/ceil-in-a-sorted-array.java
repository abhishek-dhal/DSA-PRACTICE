// User function Template for Java
class Solution {
    public int findCeil(int[] arr, int x) {
        // code here
        int n = arr.length;
       
        int ceil = -1;
        
        int low=0;
        int high=n-1;
        
        
        while(low<=high){
            
            int mid = low + (high-low)/2;
            
            if(arr[mid] < x){
                low=mid+1;
            }
            else if(arr[mid] >= x){
                ceil=mid;
                high=mid-1;
            }
        }
        
        return ceil;
    }
}
