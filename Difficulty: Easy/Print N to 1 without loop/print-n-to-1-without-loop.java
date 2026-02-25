class Solution {
    
    void print(int N){
        
        if(N == 0) return;
        
        System.out.print(N + " ");
        
        print(N-1);
    }

    void printNos(int N) {
        
        print(N);
        
        // return;
        
    }
}