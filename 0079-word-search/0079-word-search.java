class Solution {
    boolean val = false;
    public boolean exist(char[][] board, String word) {
        int row = board.length;
        int col = board[0].length;
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(board[i][j] == word.charAt(0)){
                    dfs(board, row, col, i, j, word, 0);
                }
            }
        }
        return val;
    }
    public void dfs(char[][] grid, int row, int col, int i, int j, String word, int index){
        if(index == word.length()){
            val = true;
            return;
        }
        if(i<0 || j<0 || i>=row || j>=col || grid[i][j] != word.charAt(index)){
            return;
        }
        char c = grid[i][j];
        grid[i][j] = ' ';
        dfs(grid, row, col, i+1, j, word, index+1);
        dfs(grid, row, col, i-1, j, word, index+1);
        dfs(grid, row, col, i, j+1, word, index+1);
        dfs(grid, row, col, i, j-1, word, index+1);
        grid[i][j] = c;
    }
}