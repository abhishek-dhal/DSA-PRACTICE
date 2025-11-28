// User function Template for Java

class Solution {
    public ArrayList<Integer> findSubarray(int arr[]) {
        // code here
         int n = arr.length;
        int start = -1;
        int end = -1;
        int currStart = -1;
        int currEnd = -1;
        int sum = 0;
        int currSum = 0;
        
        int i=0;
        
        while(i<n){
            if(arr[i] >= 0){
                currStart = i;
                currSum = 0;
                while(i < n && arr[i] >= 0){
                    currSum = currSum + arr[i];
                    i++;
                }
                currEnd = i - 1;
                if(currSum > sum){
                    start = currStart;
                    end = currEnd;
                    sum = currSum;
                }
                
                else if(currSum == sum && (end - start) < (currEnd - currStart)){
                    start = currStart;
                    end = currEnd;
                }
            }
            else{
                i++;
            }
            
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        if(start == -1){
            ans.add(-1);
            return ans;
        }
        
        for(int j=start;j<=end;j++){
            ans.add(arr[j]);
        }
        
        return ans;
    }
}