class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;

        int[] pos = new int[n/2];
        int[] neg = new int[n/2];

        int i = 0;
        int j = 0;
        for(int num : nums){
            if(num > 0){
                pos[i] = num;
                i++;
            }
            else if(num < 0){
                neg[j] = num;
                j++;
            }
            
        }

        int[] result = new int[n];
        for(int k=0;k<n/2;k++){

            result[2*k] = pos[k];
            result[2*k + 1] = neg[k];
        }

        return result;
  }
}