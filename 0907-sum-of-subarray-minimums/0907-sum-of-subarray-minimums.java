class Solution {
    public int[] nextSmall(int[] arr){

        int n = arr.length;
        int[] nse = new int[n];
        //storing indices
        Stack<Integer> s = new Stack<Integer>();

        for(int i=n-1;i>=0;i--){
            while(!s.empty() && arr[s.peek()] > arr[i]){
                s.pop();
            }
            nse[i] = s.empty() ? n : s.peek();
            s.push(i);
        }
        return nse;

    }
    public int[] previousSmall(int[] arr){
        int n = arr.length;

        int[] pse = new int[n];
        //Storing indices
        Stack<Integer> s = new Stack<Integer>();

        for(int i=0;i<n;i++){

            while(!s.empty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            pse[i] = s.empty() ? -1 : s.peek();
            s.push(i);
        }

        return pse;

    }
    public int sumSubarrayMins(int[] arr) {

        int n = arr.length;

        int MOD = 1_000_000_007;

        int[] L = new int[n];
        int[] R = new int[n];

        L = previousSmall(arr);
        R=  nextSmall(arr);

        long total_sum = 0;

        for(int i=0;i<n;i++){
            long el = arr[i];
            long c = ((i-L[i]) * (R[i] - i))%MOD;
            total_sum = (total_sum +  (el * c)%MOD) % MOD;
        }


        return (int)total_sum;


        
    }
}