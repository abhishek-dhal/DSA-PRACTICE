class Solution {
    public int[] findAnswer(int[] temperatures){
        int n = temperatures.length;

        int[] ans = new int[n];

        Stack<Integer> st = new Stack<>();

        for(int i = n-1;i>=0;i--){
            int el = temperatures[i];
            while(!st.isEmpty() && el >= temperatures[st.peek()]){
                st.pop();
            }
            ans[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }

        int[] res = new int[n];

        for(int i=0;i<n;i++){
            res[i] = ans[i] == -1 ? 0 : ans[i] - i;
        }
        return res;
    }
    public int[] dailyTemperatures(int[] temperatures) {
        int  n = temperatures.length;

        int[] ans = new int[n];

        ans = findAnswer(temperatures);

        return ans;

         
    }
}