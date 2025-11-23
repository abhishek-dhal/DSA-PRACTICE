class Solution {
    public static void printReverse(int i,int N){
        if(i<1) return;
        System.out.print(i + " ");
        printReverse(i-1,N);
    }
    void printNos(int N) {
        printReverse(N,N);
        
        
    }
}