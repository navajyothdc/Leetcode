class Solution {
    boolean val = false;
    public boolean exist(char[][] board, String word) {
        int row = board.length;
        int col = board[0].length;
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(board[i][j] == word.charAt(0)){
                    dfs(board, row, col, i, j, word, "");
                }
            }
        }
        return val;
    }
    public void dfs(char[][] grid, int row, int col, int i, int j, String word, String ans){
        if(i<0 || j<0 || i>=row || j>=col || !word.contains(ans + Character.toString(grid[i][j]))){
            return;
        }
        ans = ans + Character.toString(grid[i][j]);
        char c = grid[i][j];
        grid[i][j] = ' ';
        if(ans.equals(word))
            val = true;
        dfs(grid, row, col, i+1, j, word, ans);
        dfs(grid, row, col, i-1, j, word, ans);
        dfs(grid, row, col, i, j+1, word, ans);
        dfs(grid, row, col, i, j-1, word, ans);
        grid[i][j] = c;
    }
}