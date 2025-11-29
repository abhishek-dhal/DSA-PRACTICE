class Solution {
    
    int firstOccur(int[] arr,int target){
        int n=arr.length;
        int low=0;
        int high=n-1;
        int fIndex = -1;
        
        while(low <= high){
            int mid = low+(high-low)/2;
            if(arr[mid] == target){
                fIndex=mid;
                high=mid-1;
            }
            else if(arr[mid] < target){
                low=mid+1;
            }
            else if(arr[mid] > target){
                high=mid-1;
            }
        }
        return fIndex;
    }
    int lOccur(int[] arr,int target){
        int n=arr.length;
        int low=0;
        int high=n-1;
        int lIndex = -1;
        
        while(low <= high){
            int mid = low+(high-low)/2;
            if(arr[mid] == target){
                lIndex=mid;
                low=mid+1;
            }
            else if(arr[mid] > target){
                high=mid-1;
            }
            else if(arr[mid] < target){
                low=mid+1;
            }
        }
        return lIndex;
    }
    int countFreq(int[] arr, int target) {
        // code here
        int n=arr.length;
        int low=0;
        int high=n-1;
        
        int f = firstOccur(arr,target);
        
        if(f == -1){
            return 0;
        }
        int l = lOccur(arr,target);
        
        
       
        
        
        return l-f+1;
    }
}
