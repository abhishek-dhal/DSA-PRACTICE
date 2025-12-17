class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        int n = arr.length;
        
        ArrayList<Integer> res = new ArrayList<>();
        
        // x ---> duplicate
        //y -----> missing
        
        long expectedSum = (long) n * (n + 1) / 2;
        long expectedSqSum = (long) n * (n + 1) * (2L*n + 1) / 6; 
        
        long actualSum = 0;
        long actualSqSum = 0;
        
        for(int num: arr){
            actualSum += num;
            actualSqSum += (long)num*num;
        }
        
        //actualSum - expectedSum ----> x - y
        //actualSqSum - expectedSqSum -----> x^2 - y^2
        
        long diff = actualSum - expectedSum;
        long sqDiff = actualSqSum - expectedSqSum;
        
        long sum = sqDiff/diff;  //x + y
        
        
        long duplicate = (sum + diff) / 2;
        long missing = sum - duplicate;
        
        res.add((int)duplicate);
        res.add((int)missing);
        
        return res;
        
        
        
        
        
        
    }
}
