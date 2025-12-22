// User function Template for Java

class Solution {
    public int rowWithMax1s(int arr[][]) {
        
        int n = arr.length;
        int m = arr[0].length;
        
        int maxRow = -1;
        
        int minFirstIndex = m; // smallest index of 1 before search
        
        for(int i=0;i<n;i++){
            
            int firstOne = m;
            
            int low = 0;
            int high = m - 1;
            
            while(low<=high){
                int mid = low + (high-low)/2;
                
                if(arr[i][mid] == 1){
                    firstOne = mid; //possible first 1 index(column index)
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
          //update answer if this row has more 1s
          if(firstOne < minFirstIndex){
              minFirstIndex = firstOne;
              maxRow = i;
          }
        }
        
        return maxRow;
        
    }
}