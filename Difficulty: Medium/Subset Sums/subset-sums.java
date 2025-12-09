// User function Template for Java//User function Template for Java
class Solution {
    private void findSum(int ind,int sum,int[] arr,ArrayList<Integer> ans){
    if(ind == arr.length){
        ans.add(sum);
        return;
    }
    
    //pick
    findSum(ind+1,sum+arr[ind],arr,ans);
    
    //not pick
    findSum(ind+1,sum,arr,ans);
    }
    public ArrayList<Integer> subsetSums(int[] arr) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        findSum(0,0,arr,ans);
        return ans;
    }
}