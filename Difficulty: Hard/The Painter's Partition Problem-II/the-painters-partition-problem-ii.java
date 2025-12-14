class Solution {
    public int n;
    public boolean isPossible(int mid,int[] arr,int k){
        
        int bLength=0;
        int painterNo = 1;
        
        for(int i=0;i<n;i++){
            if(bLength + arr[i] <= mid){
                bLength += arr[i];
                
            }
           else{
                painterNo++;
            if(painterNo > k || arr[i] > mid){
                return false;
            }
            bLength = arr[i];
           }
        }
        return true;
    }
    public int minTime(int[] arr, int k) {
        // code here
        n = arr.length;
        
        int sum=0;
        for(int i=0;i<n;i++){
            sum += arr[i];
        }
        
        int s=0;
        int e=sum;
        int ans=-1;
        
        while(s<=e){
            int mid = s + (e-s)/2;
            
            if(isPossible(mid,arr,k)){
                ans = mid;
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return ans;
    }
}
