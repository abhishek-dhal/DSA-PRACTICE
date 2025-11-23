class Solution {
    // Function to calculate factorial of a number.
    int factorial(int n) {
       
       
       if(n==0) return 1;
       
       int fact=1;
       
       for(int i=2;i<=n;i++){
           fact=fact*i;
       }
       
       return fact;
        
    }
}
