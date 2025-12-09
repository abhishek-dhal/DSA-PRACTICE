class Solution {
    private void findCombination(int ind,String digits,HashMap<Character,String> map, List<String> ans,StringBuilder path){
        if(ind == digits.length()){
            //to avoid add empty string
            if(path.length() > 0){
                ans.add(path.toString());
            }
            return;
        }

        char digit = digits.charAt(ind);  //ex:- '2'
        String letters = map.get(digit); //ex:- '2' ----> "abc";

        for(int i=0;i<letters.length();i++){
            char ch = letters.charAt(i);

            //pick
            path.append(ch);

            //next call,explore next digit
            findCombination(ind+1,digits,map,ans,path);

            //not pick ,backtrack
            path.deleteCharAt(path.length()-1);
        }

    }
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        HashMap<Character,String> map = new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        findCombination(0,digits,map,ans,new StringBuilder());
        return ans;
        
    }
}