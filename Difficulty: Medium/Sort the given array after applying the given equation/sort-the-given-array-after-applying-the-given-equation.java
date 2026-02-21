class Solution {
    
    public int transform(int x,int A,int B,int C){
        int num = A * x * x + B * x + C;
        
        return num;
    }
    public ArrayList<Integer> sortArray(int[] arr, int A, int B, int C) {
        // Code here
        
        int n = arr.length;
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int i = 0; i < n; i++){
            
            int num = transform(arr[i],A,B,C);
            ans.add(num);
        }
        
        Collections.sort(ans);
        
        return ans;
        
    }
}