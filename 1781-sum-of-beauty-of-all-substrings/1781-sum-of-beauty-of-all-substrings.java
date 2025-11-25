class Solution {

    private int getMax(int[] freq){
        int max=Integer.MIN_VALUE;

        for(int i=0;i<26;i++){
            if(freq[i] > max){
                max=freq[i];
            }
        }

        return max;
    }

    private int getMin(int[] freq){
        int min=Integer.MAX_VALUE;

        for(int i=0;i<26;i++){
            if(freq[i] < min && freq[i] > 0){
                min=freq[i];
            }
        }

        return min;
    }
    public int beautySum(String s) {
        int n=s.length();
        int sum = 0;

        for(int i=0;i<n;i++){
            int[] freq = new int[26];
            for(int j=i;j<n;j++){
                
                char c = s.charAt(j);
                freq[c - 'a']++;

                int maxFreq = getMax(freq);
                int minFreq = getMin(freq);

                int beauty = maxFreq-minFreq;

                sum = sum + beauty;

                

                
            }
        }

        return sum;
    }
}