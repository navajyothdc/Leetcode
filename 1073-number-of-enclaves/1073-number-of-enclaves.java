class Solution {
    int total=0;
    public int numEnclaves(int[][] grid) {
        total = 0;
        int ans = 0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if((i==0 || j==0 || i==grid.length-1 || j == grid[0].length-1) && grid[i][j] == 1){
                    unmark(grid, i, j);
                }
            }
        }
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j] == 1){
                    dfs(grid, i, j);
                }
            }
        }
        return total;
    }
    public void dfs(int[][] grid, int i, int j){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j] == 0){
            return;
        }
        total++;
        grid[i][j] = 0;
        dfs(grid,i+1,j);
        dfs(grid,i-1,j);
        dfs(grid,i,j+1);
        dfs(grid,i,j-1);
    }
    public void unmark(int[][] grid, int i, int j){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j] == 0){
            return;
        }
        grid[i][j] = 0;
        unmark(grid,i+1,j);
        unmark(grid,i-1,j);
        unmark(grid,i,j+1);
        unmark(grid,i,j-1);
    }
}