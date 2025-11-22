// User function Template for C++
class Solution {
  public:
    bool armstrongNumber(int n) {
        // code here
        int original=n;
        bool flag=false;
        int sum=0;
        while(n!=0){
            int pop=n%10;
            sum= sum + pop*pop*pop;
            n=n/10;
        }
        
        if(sum == original) flag=true;
        
        return flag;
    }
};