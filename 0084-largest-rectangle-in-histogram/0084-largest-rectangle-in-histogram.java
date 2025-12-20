class Solution {
    public int[] findPSE(int[] heights){
        int n = heights.length;
        int[] pse = new int[n];
        
        Stack<Integer> s = new Stack<Integer>();
        
        for(int i=0;i<n;i++){
            
            while(!s.empty() && heights[s.peek()] >= heights[i]){
                s.pop();
            }
            pse[i] = s.empty() ? -1 : s.peek();
            s.push(i);
        }
        return pse;
    }
    public int[] findNSE(int[] heights){
       int n = heights.length;
        int[] nse = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }
            nse[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }
        return nse;

    }
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;

        int[] pse = new int[n];
        int[] nse = new int[n];

        pse = findPSE(heights);

        nse = findNSE(heights);

       int best = -1;

        for(int i=0;i<n;i++){
            int area = (nse[i] - pse[i] - 1) * heights[i];
            best = Math.max(best,area);
        }

        return best;

    }
}