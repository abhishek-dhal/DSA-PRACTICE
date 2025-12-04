class Solution {
    public int[] findPse(int[] nums){

        int n = nums.length;
        int[] pse = new int[n];

        Stack<Integer> s = new Stack<Integer>();

        for(int i=0;i<n;i++){
            while(!s.empty() && nums[s.peek()] >= nums[i]){
                s.pop();
            }
            pse[i] = s.empty() ? -1 : s.peek();
            s.push(i);
        }
        return pse;

    }
    public int[] findPge(int[] nums){
        
        int n = nums.length;
        int[] pge = new int[n];

        Stack<Integer> s = new Stack<Integer>();

        for(int i=0;i<n;i++){
            while(!s.empty() && nums[s.peek()] <= nums[i]){
                s.pop();
            }
            pge[i] = s.empty() ? -1 : s.peek();
            s.push(i);
        }
        return pge;

    }
    public int[] findNse(int[] nums){

        int n = nums.length;
        int[] nse = new int[n];

        Stack<Integer> s = new Stack<Integer>();

        for(int i=n-1;i>=0;i--){

            while(!s.empty() && nums[s.peek()] > nums[i]){
                s.pop();
            }
            nse[i] = s.empty() ? n : s.peek();
            s.push(i);
        }

        return nse;


    }
    public int[] findNge(int[] nums){

        int n = nums.length;
        int[] nge = new int[n];

        Stack<Integer> s = new Stack<Integer>();

        for(int i=n-1;i>=0;i--){
             while(!s.empty() && nums[s.peek()] < nums[i]){
                s.pop();
             }
             nge[i] = s.empty() ? n : s.peek();
             s.push(i);
        }
        return nge;

    }
    public long subArrayRanges(int[] nums) {
        int n = nums.length;
        int[] pse = new int[n];
        int[] pge = new int[n];
        int[] nse = new int[n];
        int[] nge = new int[n];

        pse = findPse(nums);
        pge = findPge(nums);
        nse = findNse(nums);
        nge = findNge(nums); 

        long total_range_sum = 0;
        long total_min_sum = 0;
        long total_max_sum = 0;


        for(int i=0;i<n;i++){
            long el = nums[i];
            long sc = (long)(i - pse[i]) * (nse[i] - i);
            total_min_sum = total_min_sum + (el * sc);

            long lc =(long)(i - pge[i]) * (nge[i] - i);

            total_max_sum = total_max_sum + (el * lc);
        }

        total_range_sum = total_max_sum - total_min_sum;


        return total_range_sum;


    }
}