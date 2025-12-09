class Solution {
    private void findSum(int ind,int k,int[] arr,int n,List<List<Integer>> ans,List<Integer> ds){
        if(n == 0 && ds.size() == k){
            ans.add(new ArrayList<>(ds));
            return;
        }

        //pick
        if(  ind < arr.length  && arr[ind] <= n){
            ds.add(arr[ind]);
            findSum(ind+1,k,arr,n-arr[ind],ans,ds);
            ds.remove(ds.size()-1);

        }
        //not pick
       
        if(ind < arr.length){
             findSum(ind+1,k,arr,n,ans,ds);
        }
       
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        int[] arr = new int[9];
        for(int i=0;i<9;i++){
            arr[i] = i+1;
        }
        findSum(0,k,arr,n,ans,new ArrayList<>());
        return ans;
    }
}