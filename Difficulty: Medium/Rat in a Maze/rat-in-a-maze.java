class Solution {
    public ArrayList<String> result;
    public int m,n;
    public Boolean[][] visited; 
    
    public void solve(int i,int j,int[][] maze,Boolean[][] visited,StringBuilder sb){
        if(i < 0 || j < 0 || i>=m || j>=n) return;
        if(maze[i][j] == 0) return;
        if(visited[i][j]) return;
        
        if(i == m-1 && j == n-1){
            result.add(sb.toString());
            return;
        }
        //mark visited
        visited[i][j] = true;
        
        //down
        sb.append('D');
        solve(i+1,j,maze,visited,sb);
        sb.deleteCharAt(sb.length()-1);
        
        //left
        sb.append('L');
        solve(i,j-1,maze,visited,sb);
        sb.deleteCharAt(sb.length()-1);
        
        //right
        sb.append('R');
        solve(i,j+1,maze,visited,sb);
        sb.deleteCharAt(sb.length()-1);
        
        //up
        sb.append('U');
        solve(i-1,j,maze,visited,sb);
        sb.deleteCharAt(sb.length()-1);
        
        //backtracking
        visited[i][j] = false;
    }
    public ArrayList<String> ratInMaze(int[][] maze) {
        // code here
        m = maze.length;
        n = maze[0].length;
        
        result = new ArrayList<>();
        
        if(maze[0][0] == 0 || maze[m-1][n-1] == 0) return result;
        
        StringBuilder sb = new StringBuilder();
        
        visited = new Boolean[m][n];
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                visited[i][j] = false;
            }
        }
        
        solve(0,0,maze,visited,sb);
        
        return result;
        
        
        
    }
}