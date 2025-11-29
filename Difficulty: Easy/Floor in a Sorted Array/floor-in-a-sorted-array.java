class Solution {
    public int findFloor(int[] arr, int x) {
        // code here
        int n = arr.length;
        
        int low=0;
        int high=n-1;
        int floor = -1;
        
        while(low <= high){
            int mid = low + (high-low)/2;
            
            
            if(arr[mid] <= x){
                //it might be the larget less than x element
                floor = mid;
                low = mid+1;
            }
            else if(arr[mid] > x){
                high = mid-1;
            }
        }
        
        return floor;
    }
}
