class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int n = arr.length;

        int i = 0;
        int j = n - 1;

        while( (j - i + 1) > k){
            if(Math.abs(arr[i] - x) > Math.abs(arr[j] - x)){
                i++;
            }
            else{
                j--;
            }
        }

        List<Integer> ans = new ArrayList<>();

        for(int m = i;m <= j; m++){
            ans.add(arr[m]);
        }

        return ans;

       
    }
}