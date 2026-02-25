class Solution {
    static void print(int i,int N){
        
        if(i == N + 1){
            return;
        }
        
        System.out.print(i + " ");
        
        print(i+1,N);
    }
    static void printTillN(int N) {
        
        print(1,N);
        
        return;
        
    }
}