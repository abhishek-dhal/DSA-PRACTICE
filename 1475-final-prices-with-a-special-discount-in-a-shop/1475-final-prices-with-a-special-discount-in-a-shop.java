class Solution {
    public int[] finalPrices(int[] prices) {
        
        int n = prices.length;
        
        //monotonic stack
        Stack<Integer> st = new Stack<>();

        int[] nse = new int[n];

        for(int i=n-1;i>=0;i--){

            while(!st.isEmpty() && prices[i] < prices[st.peek()]){
                st.pop();
            }
            nse[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }

        int[] ans = new int[n];

        for(int i=0;i<n;i++){
            ans[i] = nse[i] == -1 ? prices[i] : prices[i] - prices[nse[i]];
        }

        return ans;
    }
}