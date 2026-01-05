class Solution {
    public int[] smallestSufficientTeam(String[] req_skills, List<List<String>> people) {
        int m = req_skills.length;

        int fullMask = (1 << m) - 1; // ex:- m = 3 , 1 << m = 2^3 = 8 , fullMask = 8-1 = 7

        //skill -> Index
        Map<String,Integer> skillIndex = new HashMap<>();

        for(int i = 0; i < m;i++){
            skillIndex.put(req_skills[i],i);
        }

        // person -> skill Mask

        int n = people.size();

        int[] peopleMask = new int[n];

        for(int i = 0; i<n ;i++){
            int mask = 0;

            for(String skill : people.get(i)){
                mask = mask | (1 << skillIndex.get(skill));
            }
            peopleMask[i] = mask;
        }

         // dp[mask] = smallest team that covers mask
         Map<Integer,List<Integer>> dp = new HashMap<>();
         dp.put(0,new ArrayList<>());  // 000 -> []

         // process people
        int w = peopleMask.length;

        for(int i = 0 ; i < w ; i++){

            Map<Integer,List<Integer>> newDp = new HashMap<>(dp);

            for(int mask : dp.keySet()){
                int newMask = mask | peopleMask[i];

                List<Integer> newTeam = new ArrayList<>(dp.get(mask));
                newTeam.add(i);

                if(!newDp.containsKey(newMask) || newTeam.size() < newDp.get(newMask).size()){
                    newDp.put(newMask,newTeam);
                }
            }
            dp = newDp;
        }

        return dp.get(fullMask).stream().mapToInt(i -> i).toArray();
    }
}