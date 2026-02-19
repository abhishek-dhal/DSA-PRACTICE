class Solution {
    public int subarraySum(int[] arr) {
        // code here
        
        int n = arr.length;
        
        //total sum of subarrays 
        //sum = Ci * arr[i];
        //Ci = participation of array[i] in subarrays
        
        long sum = 0;
        
        for(int i = 0; i < n;i++){
            
            int C = (i + 1) * (n - i);
            
            sum +=  C * arr[i];
        }
        
        return (int)sum;
        
    }
}
