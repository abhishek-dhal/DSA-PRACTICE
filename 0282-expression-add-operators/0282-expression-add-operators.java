class Solution {
    public List<String> result;
    int n;
    public void solve(int ind,long resSoFar,long prevNo,String path,String num,int target){
        if(ind == n){
            if(resSoFar == target){
                result.add(path);
               
            }
             return;
        }

        for(int j=ind;j<n;j++){
            if(j > ind && num.charAt(ind) == '0') break;
            long currNum = Long.parseLong(num.substring(ind,j+1));
             //add first number without picking any operator
            if(ind == 0){
                solve(j+1,currNum,currNum,path+currNum,num,target);
            }
            else{
                solve(j+1,resSoFar+currNum,currNum,path  +"+" +currNum,num,target);
                solve(j+1,resSoFar-currNum,-currNum,path +"-"+ currNum,num,target);
                solve(j+1,resSoFar-prevNo+prevNo*currNum,prevNo*currNum,path +"*" +currNum,num,target);
            }
        }
    }
    public List<String> addOperators(String num, int target) {
        n = num.length();
        result = new ArrayList<>();

        solve(0,0,0,"",num,target);

        return result;
        
    }
}