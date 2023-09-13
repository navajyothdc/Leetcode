class Solution {
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        int freshOranges = 0;
        for(int i = 0; i < m; i++){
          for(int j = 0; j < n; j++){
            if(grid[i][j] == 2){
              q.add(new int[]{i,j}); //adding locations of rotten oranges to the queue
            }
            if(grid[i][j] == 1){
              freshOranges++;
            }
          }
        }
        if(freshOranges == 0){
          return 0; // no fresh oranges in the grid
        } 
        if(q.isEmpty()){
          return -1; //No rotten oranges so rotting cannot take place
        }
        int[][] dirs = {{0,1},{1,0},{0,-1},{-1,0}};// to traverse the grid for bfs
        int minutes = 0;
        while(!q.isEmpty()){
          int size = q.size();
          while(size-- > 0){
            int[] cell = q.remove();// retreiving the location of rotten oranges
            int x = cell[0];
            int y= cell[1]; 
            for(int[] dir : dirs){
              int dx = x + dir[0];
              int dy = y + dir[1]; // traversal to 1 of 4 directions in each iteration
              if(dx < m && dy < n && dx >= 0 && dy >= 0 && grid[dx][dy] == 1){ //if the traversed location is a fresh orrange
                grid[dx][dy] = 2;
                q.add(new int[]{dx,dy});//adding new rotten orange location
                freshOranges--;
              }
            }
            // size--;
          }
          minutes++;
        }
        if(freshOranges == 0)
          return minutes-1;
        return -1;
    }
}