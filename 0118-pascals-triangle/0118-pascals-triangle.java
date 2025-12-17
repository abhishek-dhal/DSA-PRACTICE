class Solution {
    public List<Integer> genRow(int row){
        List<Integer> list = new ArrayList<>();

        long ans = 1;
        
        list.add(1);

        // 1 ------------ 1
        // ex:- row = 5
        // row = 5 col = 1 
        //  row - col / col

        for(int col = 1;col < row;col++){
            ans = ans * (row - col);
            ans = ans / col;

            list.add((int)ans);
        }
        return list;
    }
    public List<List<Integer>> generate(int numRows) {
         List<List<Integer>> result = new ArrayList<>();

         //for row = 0 ------> numRows create row of pascal triangle and push to result;
         for(int row = 1;row <= numRows; row++){
            result.add(genRow(row));
         }

         return result;
         
    }
}