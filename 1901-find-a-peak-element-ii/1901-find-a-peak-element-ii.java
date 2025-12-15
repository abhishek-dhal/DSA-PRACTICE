class Solution {
    public int m,n;
    public int maxElementrInd(int[][] mat,int m,int n,int mid){
        int maxi = -1;
        int index = -1;

        for(int i=0;i<m;i++){
            if(maxi < mat[i][mid]){
                maxi = mat[i][mid];
                index = i;
            }
        }
        return index;
    }
    public int[] findPeakGrid(int[][] mat) {
        m = mat.length;
        n = mat[0].length;

        int low=0;
        int high = n-1;

        //we choose the search space the 0 ---> n-1 col
        //at mid check if it > left and > right if then one peak
        //if left is greater then peak is on left side
        //we resolve discard the vertical search part by choosing the largest element along the mid el correspondant column
        //left and right after boundary is -1 (given)

        while(low <= high){
            int mid = low + (high-low)/2;

            int row = maxElementrInd(mat,m,n,mid);

            int left = mid - 1 >= 0 ? mat[row][mid-1] : -1;
            
            int right = mid + 1 < n ? mat[row][mid+1] : -1;

            if(mat[row][mid] > left && mat[row][mid] > right){
                return new int[]{row,mid};
            }
            else if(mat[row][mid] < left){
                high = mid-1;
            }
            else{
                low=mid+1;
            }
        }

        return new int[]{-1,-1};
    }
}