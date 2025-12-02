class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;

        Stack<Integer> st = new Stack<Integer>();
       
       //creation of nge map
       HashMap<Integer,Integer> map  = new HashMap<>();
       
        // filling the map;
       for(int el:nums2){
        while(!st.empty() && st.peek() < el){

            int sel = st.pop();
            map.put(sel,el);
        }
        st.push(el);
       }

        while(!st.empty()){
            int poppedEl = st.pop();
            map.put(poppedEl,-1);
        }

        int[] ans = new int[n1];

        for(int i=0;i<n1;i++){
            int e = nums1[i];
            ans[i] = map.get(e);
        }

        return ans;

        
    }
}