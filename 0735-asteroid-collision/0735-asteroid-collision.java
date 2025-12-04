class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int n = asteroids.length;

        Stack<Integer> s = new Stack<Integer>();

        for(int newA:asteroids){

            int currM = Math.abs(newA);
            boolean isAlive = true;

            while(!s.empty() && s.peek() > 0 && newA < 0){
                int topM = s.peek();
                
                //new Astroid larger mass than stack top astroid mass
                if(topM < currM){
                    s.pop();
                }
                
                //Stack top is larger than new astroid
                else if(topM > currM){
                    isAlive = false;
                    break;
                }
                //new astroid mass is equal to stack top mass
                else if(topM == currM){
                    s.pop();
                    isAlive = false;
                    break;
                }
            }
            //push new astroid if it survive collision
            if(isAlive){
                s.push(newA);
            }
        }


        int[] ans = new int[s.size()];

        for(int i = s.size() -1;i>=0;i--){
            ans[i] = s.pop();
        }

        return ans;
    }
}