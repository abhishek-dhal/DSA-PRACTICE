class Solution {
    // Please change the array in-place
    public void insertionSort(int arr[]) {
       
       //take an element and place it in its correct order
       
       
       int n = arr.length;
       
       //i = 0 ---> n-1
       //for every el the correct order required
       for(int i=0;i<n;i++){
           
           //For element if left el is greater swap it and move to correct pos
           int j = i;
           
           // here j>0 as if j=0 j-1 will be -1
           while(j > 0 && arr[j-1] > arr[j]){
               int temp = arr[j];
               arr[j] = arr[j-1];
               arr[j-1] = temp;
               j--;
           }
       }
       
       
       //TC:- O(n^2) worst and avg
       //TC:- O(n)  best
        
    }
}