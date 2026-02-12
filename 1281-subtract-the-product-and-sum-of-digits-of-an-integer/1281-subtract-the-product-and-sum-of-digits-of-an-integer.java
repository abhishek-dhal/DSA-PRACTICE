class Solution {

    public int findProduct(int num){

        int prod = 1;

        while(num != 0){

            int digit = num % 10;

            prod = prod * digit;

            num = num / 10;
        }

        return prod;
    }

    public int findSum(int num){
         int sum = 0;

        while(num != 0){

            int digit = num % 10;

            sum = sum + digit;

            num = num / 10;
        }

        return sum;

    }
    public int subtractProductAndSum(int n) {
        

        int product = findProduct(n);

        int sum = findSum(n);

        return (product - sum);
    }
}