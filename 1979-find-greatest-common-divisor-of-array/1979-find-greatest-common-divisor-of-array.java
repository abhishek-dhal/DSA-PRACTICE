class Solution {
    public int GCD(int n1,int n2){
        while(n2 != 0){
            int rem = n1 % n2;

            n1 = n2;
            n2 = rem;
        }

        return n1;
    }
    public int findGCD(int[] nums) {
        int n = nums.length;

        if(n==2){
            return GCD(nums[0],nums[1]);
        }

        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(nums[i] < smallest) smallest=nums[i];
            if(nums[i] > largest) largest = nums[i];
        }

        return GCD(smallest,largest);
    }
}