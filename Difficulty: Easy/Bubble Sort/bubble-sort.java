class Solution {
    public void bubbleSort(int[] arr) {
        
        //push the max to the last by adjacent swaps
        //iteration happend from 0 ---> n-1,n-2,n-3,n-4,....,1
        //i = n-1 ----> 1
        // j = 0 ----> i -1 as for comparison a[j] > a[j+1] it is out of bound
        //TC:- O(n^2) worst,avg
        //TC:- O(n) best
        int n = arr.length;
        
        for(int i=n-1;i>=1;i--){
            for(int j=0;j<=i-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        
    }
}