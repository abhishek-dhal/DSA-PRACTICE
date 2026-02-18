// User function Template for Java

class Solution {
    // Function for adding one to the number represented by the array
    Vector<Integer> addOne(int[] arr) {
        
        int n = arr.length;
        
        Vector<Integer> ans = new Vector<>();
        
       int carry = 1;
       
       int i = n - 1;
       
       while(i >= 0){
           
           int sum = arr[i] + carry;
           
           int el = sum % 10;
           
           ans.add(el);
           
           carry = sum / 10;
           
           i--;
       }
       
       if(carry != 0){
           ans.add(carry);
       }
       
       Collections.reverse(ans);
       
       return ans;
        
    }
}