class Solution {
    
    public void printNtimes(int i,int N){
        if(i == N) return;
        
        System.out.print("GFG"+ " ");
        printNtimes(i+1,N);
    }
    

    void printGfg(int N) {
        printNtimes(0,N);
        
    }
}