class Solution {
    public int maxOnes(int arr[], int k) {
        // code here
        
        int n = arr.length;
        
        int len = 0;
        
        int s = 0;
        
        int zCnt = 0;
        
        for(int e = 0; e < n; e++){
            
            if(arr[e] == 0) zCnt++;
            
            while(zCnt > k){
                
                if(arr[s] == 0){
                    zCnt--;
                }
                
                s++;
            }
            
            len = Math.max(len,e - s + 1);
            
        }
        
        return len;
    }
}