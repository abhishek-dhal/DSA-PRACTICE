class Solution {
    // Function to calculate factorial of a number.
    int fc(int n){
        if(n == 0 || n == 1) return 1;
        
        
        
        return n * fc(n-1); 
    }
    int factorial(int n) {
        // code here
        
       return fc(n);
    }
}
