class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int n = arr.length;
        
        
        
        int max=arr[0];
        int sMax=-1;
        
        for(int i=1;i<n;i++){
            if(arr[i] > max ){
                
                sMax = max;
                max = arr[i];
            }
            
            else if(arr[i] < max && arr[i] > sMax){
                sMax = arr[i];
            }
        }
        
        return sMax;
        
    }
}