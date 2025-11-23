class Solution {
    public void reverseArray(int arr[]) {
        
        int n=arr.length;
        
        
        int first=0;
        int second=n-1;
        int temp;
        
        while(first<second){
            temp=arr[first];
            arr[first]=arr[second];
            arr[second]=temp;
            
            first++;
            second--;
        }
        
       
        
    }
}