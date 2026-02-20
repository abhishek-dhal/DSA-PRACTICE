// User function Template for Java
class Solution {

    public List<Integer> findSplit(int[] arr) {
        // Return an array of possible answer, driver code will judge and return true or
        // false based on
        
        int n = arr.length;
        
        int sum = 0;
        
        for(int num: arr){
            sum += num;
        }
        
        if(sum % 3 != 0) return Arrays.asList(-1,-1);
        
        
        int target = sum / 3;
        
        int firstCut = -1;
        
        int secondCut = -1;
        
        int currSum = 0;
        
        
        for(int i = 0; i < n; i++){
            
            currSum += arr[i];
            
            if(currSum == target && firstCut == -1){
                firstCut = i;
            }
            
            else if(currSum == 2 * target && firstCut != -1){
                secondCut = i;
                break;
            }
            
            
            
        }
        
        if(firstCut != -1 && secondCut != -1 && secondCut < n - 1){
            return Arrays.asList(firstCut,secondCut);
        }
        
        return Arrays.asList(-1,-1);
    }
}