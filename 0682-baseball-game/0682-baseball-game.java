class Solution {
    public int calPoints(String[] operations) {

        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < operations.length; i++) {

            String op = operations[i];

            if(op.equals("+")) {

                int last = list.get(list.size() - 1);
                int secondLast = list.get(list.size() - 2);

                list.add(last + secondLast);

            }
            else if(op.equals("D")) {

                int last = list.get(list.size() - 1);
                list.add(2 * last);

            }
            else if(op.equals("C")) {

                list.remove(list.size() - 1);

            }
            else {
                // number case
                list.add(Integer.parseInt(op));
            }
        }

        int ans = 0;

        for(int num : list) {
            ans += num;
        }

        return ans;
    }
}
