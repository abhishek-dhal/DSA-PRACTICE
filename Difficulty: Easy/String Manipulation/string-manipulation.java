
class Solution {
    static int removeConsecutiveSame(String[] arr) {
        
        
        Stack<String> s = new Stack<>();
        
        int n = arr.length;
        
        for(int i = 0; i < n; i++){
            
            if(!s.isEmpty() && s.peek().equals(arr[i])){
                s.pop();
            }
            else{
                s.push(arr[i]);
            }
        }
        
        return s.size();
    }
}