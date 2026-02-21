class Solution {
    // static long findSqrt(long num){
        
    //     return (long)Math.floor(Math.sqrt(num));
    // }
    
    // static long findCb(long num){
    //     long sq = findSqrt(num);
        
    //     // long cb = sq * sq * sq;
        
    //     return num * sq;
    // }
    static List<Long> jugglerSequence(long n) {
        // code here
        
        // List<Long> ans = new ArrayList<>();
        
        // ans.add(n);
        
        // while(ans.get(ans.size() - 1) != 1){
            
        //     long num = ans.get(ans.size() - 1);
            
        //     if(num % 2 == 0){
        //         long res = findSqrt(num);
                
        //         ans.add(res);
        //     }
        //     else{
        //         long res = findCb(num);
                
        //         ans.add(res);
        //     }
        // }
        
        // return ans;
        
        List<Long> ans = new ArrayList<>();
        
        ans.add(n);
        
        while(n != 1){
            
            if(n % 2 == 0){
                
                n = (long)Math.floor(Math.sqrt(n));
            }
            else{
                n = (long)Math.floor(n * Math.sqrt(n));
            }
            
            ans.add(n);
        }
        
        return ans;
        
        
    }
}