// User function Template for Java

class Solution {
    
    int findSum(int i,int sum,int[] arr){
        
        if(i == arr.length) return sum;
        
        
        return findSum(i+1, sum + arr[i], arr);
        
    }
    
    int arraySum(int arr[]) {

        
        return findSum(0,0,arr);
        
        
        
    }
}
