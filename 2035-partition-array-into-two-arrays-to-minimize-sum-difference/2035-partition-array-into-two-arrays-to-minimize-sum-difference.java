class Solution {
    //middle man pattern with extra constraint
    public int minimumDifference(int[] nums) {
        int N = nums.length;
        int n = N/2;

        int totalSum = 0;
        for(int num : nums){
            totalSum += num;
        }
         //now totalSum is calculated

        //split the array into 2 halves
        int[] left = Arrays.copyOfRange(nums,0,n);
        int[] right = Arrays.copyOfRange(nums,n,N);

        List<List<Integer>> leftSums = new ArrayList<>();
        List<List<Integer>> rightSums = new ArrayList<>();

        //we want 0 ---> n-1 sized List inside leftSums and rightSums
        //leftSum.get(k) ---> all subset sums of left using k elements

        for(int i = 0;i <= n;i++){
            leftSums.add(new ArrayList<>());
            rightSums.add(new ArrayList<>());
        }

        //generate subsets for left
        int total = 1 << n; // 2^n
        for(int masks = 0; masks < total; masks++){
            int sum = 0;
            int cnt = 0;
            for(int i = 0;i < n ;i++){
                if((masks & (1 << i)) != 0){
                    sum += left[i];
                    cnt++;
                }
            }
            leftSums.get(cnt).add(sum);
        }

        //generate subsets for right
         for(int masks = 0; masks < total; masks++){
            int sum = 0;
            int cnt = 0;
            for(int i = 0;i < n ;i++){
                if((masks & (1 << i)) != 0){
                    sum += right[i];
                    cnt++;
                }
            }
            rightSums.get(cnt).add(sum);
        }

        //sort each element of rightSum to do binary search

        for(int i = 0;i <= n;i++){
            Collections.sort(rightSums.get(i));
        }

        int ans = Integer.MAX_VALUE;

        for(int k = 0; k <= n; k++){

            //if choose k from left then n-k from right so it become n combine
            List<Integer> L = leftSums.get(k);
            List<Integer> R = rightSums.get(n-k);

            for(int ls : L){

                int target = totalSum / 2 - ls;

                int idx = Collections.binarySearch(R,target);

                //binsearch return 2 possible value
                // exact match index
                //otherwise a index where it should be
                //as we try to min abs differnce
                //it can be from idx - 1 which is just smaller than target
                //or can be from idx which is just larger 
                //so check for both cases

                if(idx >= 0){
                    int s = ls + R.get(idx);
                    ans = Math.min(ans,Math.abs(2 * s - totalSum));
                }
                else{
                    idx = -idx - 1;

                    if(idx < R.size()){
                       int s = ls + R.get(idx);
                       ans = Math.min(ans,Math.abs(2 * s - totalSum));
                    }
                    if(idx - 1 >= 0){
                       int s = ls + R.get(idx - 1);
                       ans = Math.min(ans,Math.abs(2 * s - totalSum));
                    }
                }
            }
        }


        return ans;
       
    }
}