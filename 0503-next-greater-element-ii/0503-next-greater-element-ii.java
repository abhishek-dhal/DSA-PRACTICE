class Solution {
    public int[] nextGreaterElements(int[] nums) {

        int n = nums.length;

        int[] ans = new int[n];
        
        //Fill with -1 if not found default will be -1
        Arrays.fill(ans,-1);
        
        //storing index instead of values
        Stack<Integer> st = new Stack<Integer>();
        
         //Itearte from 0 ----> 2*n-1 to touch circular constraint
        for(int i=0;i<2*n;i++){
            
            //i % n to cover n---> 2n-1
            int currVal = nums[i%n];

            while(!st.empty() && currVal > nums[st.peek()]){

                int poppedIndex = st.pop();
                ans[poppedIndex] = currVal;
            }

            if(i < n){
                st.push(i);
            }
        }

        return ans;
        
    }
}