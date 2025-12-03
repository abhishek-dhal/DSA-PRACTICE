class Solution {
    public static ArrayList<Integer> prevSmaller(int[] arr) {
        // code here
        int n = arr.length;
        int[] pse = new int[n];
        
        Stack<Integer> s = new Stack<Integer>();
        
        for(int i=0;i<n;i++){
            
            while(!s.empty() && s.peek() >= arr[i]){
                s.pop();
            }
            pse[i] = s.empty() ? -1 : s.peek();
            s.push(arr[i]);
        }
        
        
        ArrayList<Integer> al = new ArrayList<>();
        
        for(int el:pse){
            al.add(el);
        }
        
        return al;
    }
}