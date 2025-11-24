class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n=cardPoints.length;
        if(n == k){
            int sum=0;
            for(int point:cardPoints){
                sum = sum + point;
            }
            return sum;
        }

        int total_sum = 0;
        for(int p : cardPoints){
            total_sum = total_sum + p;
        }

        int windowSize=n-k;
        int currentWindowSum=0;

        for(int i=0;i<windowSize;i++){
            currentWindowSum += cardPoints[i];
        }

        int minSum = currentWindowSum;

        for(int right=windowSize;right<n;right++){

            currentWindowSum = currentWindowSum + cardPoints[right];

            currentWindowSum = currentWindowSum - cardPoints[right-windowSize];


            minSum = Math.min(minSum,currentWindowSum);
        }

        return total_sum - minSum;
    }
}