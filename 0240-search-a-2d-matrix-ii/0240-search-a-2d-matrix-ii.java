class Solution {
    public int m,n;
    public boolean searchMatrix(int[][] matrix, int target) {
        m =  matrix.length;
        n = matrix[0].length;

        int row = 0;
        int col = n-1;

        while(row < m && col >= 0){
            if(target == matrix[row][col]){
                return true;
            }
            //too big move left
            else if(matrix[row][col] > target){
                col--;
            }
            //small move right
            else{
                row++;
            
            }
        }
        return false;
    }
}