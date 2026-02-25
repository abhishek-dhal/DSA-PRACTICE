class Solution {
    public ArrayList<Integer> findMxMn(int i,int maxi,int mini,int[] arr){
        
        if(i == arr.length){
            
            ArrayList<Integer> ans = new ArrayList<>();
            ans.add(mini);
            ans.add(maxi);
            
            return ans;
        }
        
        if(arr[i] > maxi) maxi = arr[i];
        
        if(arr[i] < mini) mini = arr[i];
        
        return findMxMn(i+1,maxi,mini,arr);
    }
    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        
        
        return findMxMn(0,arr[0],arr[0],arr);
    }
}
