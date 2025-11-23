class Solution {
    public static void printToN(int i,int N){
        if(i>N) return;
        
        System.out.print(i+" ");
        printToN(i+1,N);
    }
    static void printTillN(int N) {
        
        printToN(1,N);
        
    }
}