class Solution {
    public long subarrayXor(int arr[], int k) {
        
        int n = arr.length;
        HashMap<Integer,Integer> x = new HashMap<>();
        
        int xor = 0;
        int cnt = 0;
        
        x.put(0,1);
        
        for(int i=0;i<n;i++){
            
            xor = xor ^ arr[i];
            
            int want = xor ^ k;
            
            if(x.containsKey(want)){
                cnt = cnt + x.get(want);
            }
            
            x.put(xor,x.getOrDefault(xor,0)+1);
        }
        
        return cnt;
        
        
    }
}