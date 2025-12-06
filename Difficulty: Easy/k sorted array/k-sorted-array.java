// User function Template for Java

class Solution {
    static String isKSortedArray(int arr[], int n, int k) {
        // code here
       
        //create duplicate copy
        int[] dc = new int[n];
        
        //store values in dupliacte array
        for(int i=0;i<n;i++){
            dc[i] = arr[i];
        }
        
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        
        //sort dupliacte array
        Arrays.sort(dc);
        
        for(int i=0;i<n;i++){
            map.put(dc[i],i);
        }
        
       for(int i=0;i<n;i++){
           int j = map.get(arr[i]);
           
           if(Math.abs(i-j) > k){
               return "No";
           }
       }
       
       return "Yes";
        
    }
}