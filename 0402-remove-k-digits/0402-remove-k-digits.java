class Solution {
    public String removeKdigits(String num, int k) {

        int n = num.length();

        
        
        //to store digits in non-decreasing order
        Stack<Character> s = new Stack<Character>();
       
       //store character digits in required order
        for(int i=0;i<n;i++){
            char cd = num.charAt(i);

            while(!s.empty() && k >0 && s.peek() > cd){
               
                s.pop();
                k--;
            }
            s.push(cd);

        }

            //if k criteria not full filled remove extra larger character digits
            while(k >0){
                s.pop();
                k--;
            }
    


        StringBuilder ans = new StringBuilder();

        for (char c : s){
            ans.append(c);
        }

        if(ans.length() == 0){
            return "0";
        }

        //Handling leading zeros

        int zeroCnt=0;

        while(zeroCnt < ans.length() && ans.charAt(zeroCnt) == '0'){
            zeroCnt++;
        }

        int len = ans.length();

        String result = ans.substring(zeroCnt,len);


        if(result.length() == 0){
            return "0";
        }
        return result;



        
    }
}