class Solution {
    public List<Integer> majorityElement(int[] nums) {
         List<Integer> res = new ArrayList<>();
         //cancel out majority logic
         //minor will not able to majority majority stay after end
         int n = nums.length;
         int el1 = -1;
         int el2 = -1;
         int cnt1 = 0;
         int cnt2 = 0;

         for(int i=0;i<n;i++){
            if(cnt1 == 0 && nums[i] != el2){
                cnt1 = 1;
                el1 = nums[i];
            }
            else if(cnt2 == 0 && nums[i] != el1){
                cnt2 = 1;
                el2 = nums[i];
            }
            else if(nums[i] == el1){
                cnt1++;
            }
            else if(nums[i] == el2){
                cnt2++;
            }
            else{
                cnt1--;
                cnt2--;
            }
         }

         int temp1 = 0;
         int temp2 = 0;
         for(int i=0;i<n;i++){
            if(nums[i] == el1){
                temp1++;
            }
            else if(nums[i] == el2){
                temp2++;
            }
         }



         if(temp1 > n/3)  res.add(el1);
         if(temp2 > n/3 && el2 != el1)  res.add(el2);

         return res;
    }
}