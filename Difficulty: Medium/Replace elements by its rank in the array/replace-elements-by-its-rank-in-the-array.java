// User function Template for Java

class Solution {
    static int[] replaceWithRank(int arr[], int N) {
        // code here
        
        //hashset for storing unique elements
        HashSet<Integer> unique = new HashSet<>();
        
        //adding elements to set from array
        for(int el: arr){
            unique.add(el);
        }
        
        //create a list from hashset 
        ArrayList<Integer> uniqueList = new ArrayList<Integer>(unique);
        
        //sort the list
        
        Collections.sort(uniqueList);
        
        //create map for store rank
        
        HashMap<Integer,Integer> rank = new HashMap<>();
        
        //store rank of unique elements
        for(int i =0;i<uniqueList.size();i++){
            int value = uniqueList.get(i);
            
            
            
            rank.put(value,i+1);
        }
        
        //now final result rank array
        int[] result = new int[N];
        
        for(int i=0;i<N;i++){
            
            int el = arr[i];
            int elRank = rank.get(el);
            
            result[i] = elRank;
        }
        
        return result;
        
    }
}
