class Solution {
    public String reverseString(String result){

        char[] arr = result.toCharArray();

        int left = 0;

        int right = arr.length - 1;

        while(left < right){
            char temp = arr[left];

            arr[left] = arr[right];

            arr[right] = temp;

            left++;

            right--;
        }

        String reversed = new String(arr);

        return reversed;


    }
    public String addStrings(String num1, String num2) {
        
        int n1 = num1.length();
        int n2 = num2.length();

        int i = n1-1;
        int j = n2-1;

        int carry = 0;

        StringBuilder ans = new StringBuilder();

        while(i >= 0 || j >= 0 || carry != 0){
            int val1 = 0;
            int val2 = 0;

            if(i >= 0) val1 = num1.charAt(i) - '0';
            if(j >= 0) val2  = num2.charAt(j) - '0';

       
            int sum = val1 + val2 + carry;

            int digit = sum % 10;
            carry = sum / 10;

            ans.append((char)(digit + '0'));

            i--;
            j--;


        }

        String result = ans.toString();

        return reverseString(result);
    }
}