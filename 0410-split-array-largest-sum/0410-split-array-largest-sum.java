class Solution {
    int n;
    public boolean isPossible(int mid,int[] nums,int k){

        int subArrNo = 1;
        int numSum = 0;

        for(int i=0;i<n;i++){
            if(numSum + nums[i] <= mid){
                numSum += nums[i];
            }
            else{
                subArrNo++;
                if(subArrNo > k || nums[i] > mid){
                    return false;
                }
                numSum = nums[i];
            }
        }
        return true;
    }
    public int splitArray(int[] nums, int k) {
        n = nums.length;

        int sum = 0;
        for(int i=0;i<n;i++){
            sum += nums[i];
        }

        int s=0;
        int e=sum;
        int ans=-1;

        while(s <= e){
            int mid = s+ (e-s)/2;

            if(isPossible(mid,nums,k)){
                ans = mid;
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }

        return ans;


        
    }
}