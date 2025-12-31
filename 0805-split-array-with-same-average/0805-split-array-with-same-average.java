class Solution {
    public boolean splitArraySameAverage(int[] nums) {
        int N = nums.length;

        int totalSum = 0;
        for(int num : nums){
            totalSum = totalSum + num;
        }
        //for creating 2 halves left and right
        int n = N/2;
        int rn = N - n;

        int[] left = Arrays.copyOfRange(nums,0,n);
        int[] right = Arrays.copyOfRange(nums,n,N);

        //leftSums and rightSums of size
        List<List<Integer>> leftSums = new ArrayList<>();
        List<List<Integer>> rightSums = new ArrayList<>();

        //creation of left adding empty list
        for(int i=0;i<=n;i++){
            leftSums.add(new ArrayList<>());
        }

        //creation of right adding empty list
        for(int i=0;i<=rn;i++){
             rightSums.add(new ArrayList<>());
        }

         // Generate subset sums for left half
         int totalL = 1 << n;

         for(int mask=0; mask < totalL; mask++){
            int sums = 0;
            int cnt = 0;
            for(int i=0;i<n;i++){
                if((mask & (1 << i)) != 0){
                    sums = sums + left[i];
                    cnt++;
                }
            }
            leftSums.get(cnt).add(sums);
         }

          // Generate subset sums for right half

         
          int totalR = 1 << rn;

          for(int mask=0; mask < totalR; mask++){
            int sums = 0;
            int cnt = 0;
            for(int i=0;i<rn;i++){
                if((mask & (1 << i)) != 0){
                    sums = sums + right[i];
                    cnt++;
                }
            }
            rightSums.get(cnt).add(sums);
          }

          // Sort right subset sums for binary search
          for(int i=0;i<=n;i++){
            Collections.sort(rightSums.get(i));
          }

           // Try all possible subset sizes k
           for(int k=1; k<=n; k++){

            // Check if target sum is integer
            if((totalSum * k)% N != 0) continue;

            int target = (totalSum * k) / N;

            // Split k between left and right halves

           
            for(int i = Math.max(0,k-rn) ; i <= Math.min(k,n); i++){

                List<Integer> L = leftSums.get(i);
                List<Integer> R = rightSums.get(k-i);

                for(int ls : L){
                    int need = target - ls;

                    if(Collections.binarySearch(R,need) >= 0){
                        return true;
                    }
                }
            }
           }
           return false;
    }
}