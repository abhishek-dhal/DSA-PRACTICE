class Solution {
    static ArrayList<Integer> nextSmallerEle(int[] arr) {
        // code here
        int n = arr.length;
        
        int[] resultArr = new int[n];
        
        Arrays.fill(resultArr,-1);
        
        //storing index instead of actual value
        Stack<Integer> s = new Stack<Integer>();
        
        for(int i=0;i<n;i++){
            
            int currVal = arr[i];
            
            while(!s.empty() && arr[s.peek()] > currVal){
                int iPop = s.pop();
                
                resultArr[iPop] = currVal;
            }
            s.push(i);
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int el:resultArr){
            ans.add(el);
        }
        
        return ans;
    }
}