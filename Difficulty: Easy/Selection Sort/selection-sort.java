class Solution {
    void selectionSort(int[] arr) {
        
        //First we found the minimum element from i = 0 ---> n-2
        //when found swap it with ith element
        //Then skip the sorted part and iterate the unsorted part
        // And find min element index and swap continue
        //Everytime skip the sorted part
        //Internal loop start from ex j = i ---> n-1 to find min_el index
        //External loop start from ex i = 0 ----> n-2 as last element no need
        
        
        int n= arr.length;
        
        for(int i=0;i<=n-2;i++){
            int mini = i;
            for(int j=i;j<=n-1;j++){
                if(arr[j] < arr[mini]){
                    mini = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[mini];
            arr[mini] = temp;
            
        }
        
    }
}