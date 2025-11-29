class Solution {
    // public int find(int[] a,int low,int high,int x){

    //     while(low<=high){
    //         int mid = low + (high-low)/2;

    //         if(a[mid] == x){
    //             return a[mid];
    //         }
    //         else if(a[mid] < x){
    //             low=mid+1;
    //         }
    //         else{
    //             high=mid-1;
    //         }
    //     }
    //     return -1;
    // }
    public int findMin(int[] nums) {
        int n=nums.length;

        if(n == 1){
            return nums[0];
        }
        int i=0;
        int j=1;
        

        while(i<n-1 && j<n && nums[i] < nums[j]){
            i++;
            j++;
        }
        // i ----> last index of fHalf
        // j -----> firse index of sHalf

        if(i == n-1){
            int ans = nums[0];
            return ans;
        }

        int f = nums[0];
        int s = nums[j];

        if(f <= s){
            return f;
        }
        if(f > s){
            return s;
        }
        return -1;
    }
}