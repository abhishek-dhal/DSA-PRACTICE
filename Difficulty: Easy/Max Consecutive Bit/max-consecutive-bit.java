class Solution {
    public int maxConsecBits(int[] arr) {
        // code here
        
        int n = arr.length;
        
        int cnt_0 = 0;
        
        int cnt_1 = 0;
        
       int maxCnt0 = Integer.MIN_VALUE;
        
       int maxCnt1 = Integer.MIN_VALUE;
        
        for(int i = 0;i < n; i++){
            
            if(arr[i] == 0){
                
                if(cnt_1 != 0){
                    maxCnt1 = Math.max(maxCnt1,cnt_1);
                    cnt_1 = 0;
                }
                cnt_0++;
            }
            else if(arr[i] == 1){
                
                if(cnt_0 != 0){
                    maxCnt0 = Math.max(maxCnt0,cnt_0);
                    cnt_0 = 0;
                }
                cnt_1++;
            }
            
        }
        
        maxCnt0 = Math.max(maxCnt0,cnt_0);
        
        maxCnt1 = Math.max(maxCnt1,cnt_1);
        
        return Math.max(maxCnt0,maxCnt1);
    }
}
