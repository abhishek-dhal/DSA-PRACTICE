class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int[] ans = new int[2];
        ans[0] = -1;
        ans[1] = -1;

        int i = 0;
        int j = n-1;

        while(i < j){
            int sum = numbers[i] + numbers[j];

            if(sum < target){
                i++;
            }
            else if(sum > target){
                j--;
            }

            else{
                ans[0] = i+1;
                ans[1] = j+1;
                return ans;
            }
        }
        return ans;
    }
}