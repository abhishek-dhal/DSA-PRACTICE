class Solution {
    public int n;
    
    public boolean isPossible(int mid,int[] arr,int k){
        
        int pageCnt = 0;
        int studentCnt = 1;
        
        for(int i=0;i<n;i++){
            if(pageCnt + arr[i] <= mid){
                pageCnt += arr[i];
            }
            else{
                studentCnt++;
                if(studentCnt > k || arr[i] > mid){
                    return false;
                }
                pageCnt = arr[i];
            }
        }
        return true;
    }
    public int findPages(int[] arr, int k) {
        // code here
        n = arr.length;
        
        if(k > n) return -1;
        
        int sum = 0;
        for(int i=0;i<n;i++){
            sum += arr[i];
        }
        
        int s = 0;
        int e = sum;
        int ans = -1;
        
        while(s <= e){
            int mid = s + (e-s)/2;
            
            if(isPossible(mid,arr,k)){
                ans = mid;
                e = mid-1;
            }
            else{
                s = mid+1;
            }
        }
        
        return ans;
        
    }
}