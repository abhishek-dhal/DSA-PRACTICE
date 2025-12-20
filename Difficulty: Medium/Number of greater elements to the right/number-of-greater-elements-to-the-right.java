
class Solution {
    public static int findNoNGE(int arr[],int idx){
        int n = arr.length;
        int cnt = 0;
        
        int value = arr[idx];
        for(int i = idx+1;i<n;i++){
            if(arr[i] > value){
                cnt++;
            }
        }
        return cnt;
    }
    public static int[] count_NGE(int arr[], int indices[]) {
       
       int n = arr.length;
       int m = indices.length;
       
       int[] ans = new int[m];
       
       for(int i=0;i<m;i++){
           ans[i] = findNoNGE(arr,indices[i]);
       }
       return ans;
        
    }
}
