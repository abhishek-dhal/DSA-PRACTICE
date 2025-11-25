class Solution {
    public String largestOddNumber(String num) {
        int n=num.length();
        int right=n-1;
        String number = "";

        while(right >= 0){

            if((num.charAt(right) - '0') % 2 != 0){
                int end = right;
                number = num.substring(0,end+1);
                return number;
            }

            right--;
        }

        return number;
    }
}