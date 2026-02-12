class Solution {
    public int addDigits(int num) {

        //edge case
       if(num == 0) return 0;
    

       // digital root formula
       return (num - 1) % 9 + 1;
    }
}