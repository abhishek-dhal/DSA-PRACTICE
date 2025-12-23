class Solution {
    public int celebrity(int mat[][]) {
    
       int n = mat.length;
       
       int left = 0;
       int right = n - 1;
       
       //by two pointer we eliminate non-celebrity
       //left out with one possible celebrity
       while(left < right){
           //left -> right == 1
           //left know right
           //left ---> non-celebrity
           if(mat[left][right] == 1){
               left++;
           }
           //left -> right ==0
           //right not known by left
           //right ---> non-celebrity
           else if(mat[left][right] == 0){
               right--;
           }
       }
       
       //verify the possible celebrity is celebrity or not
       for(int i=0;i<n;i++){
           //not necessary to check if celebrity know celebrity
           if(left == i) continue;
           
           if(mat[left][i] == 1 || mat[i][left] == 0){
               return -1;
           }
       }
       
       return left;
        
    }
}