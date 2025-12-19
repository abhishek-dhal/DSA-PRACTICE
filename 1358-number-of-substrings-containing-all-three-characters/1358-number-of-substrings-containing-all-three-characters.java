class Solution {
    public int numberOfSubstrings(String s) {

        // Sliding window: once window is valid, all extensions to right are valid
        // Count (n - right), then shrink from left

        
        int n = s.length();

        int cnt_a = 0;
        int cnt_b = 0;
        int cnt_c = 0;
        int ans = 0;

        int left = 0;
        

        for(int right = 0;right < n;right ++){

            if(s.charAt(right) == 'a') cnt_a++;
            else if(s.charAt(right) == 'b') cnt_b++;
            else cnt_c++;

            while(cnt_a > 0 && cnt_b > 0 && cnt_c > 0){

                ans = ans + (n - right);

                if(s.charAt(left) == 'a') cnt_a--;
                else if(s.charAt(left) == 'b') cnt_b--;
                else cnt_c--;

                left++;
            }
        }
        return ans;
    }
}