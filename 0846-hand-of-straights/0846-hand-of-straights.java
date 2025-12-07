class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        int n = hand.length;

        int gs = groupSize;

        if(n % gs != 0) return false;
        //cnt freq and keep them in sorted
        TreeMap<Integer,Integer> tm = new TreeMap<>();

        for(int card: hand){
            tm.put(card,tm.getOrDefault(card,0)+1);

        }


        while(!tm.isEmpty()){
            //smallest
            int start = tm.firstKey();

            for(int i = start;i<start+gs;i++){
                if(!tm.containsKey(i)){
                    return false;
                }

                int freq = tm.get(i) - 1;
                if(freq == 0){
                    tm.remove(i);
                }
                else{
                    tm.put(i,freq);
                }
            }
        }

        return true;
    }
}