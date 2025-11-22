class Solution {
    public int countDigits(int num) {
        if(num == 1) return 1;
        int original = num;

        int ans = 0;
        while(num!=0){
            int pop = num%10;
            if(original % pop == 0)  ans++;
            num = num/10;
        }

        return ans;
    }
}