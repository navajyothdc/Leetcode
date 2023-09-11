class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
            int row = image.length;
            int col = image[0].length;
            dfs(image, sr, sc, row, col, color, image[sr][sc]);
            for(int i = 0; i < image.length; i++){
                for(int j = 0; j < image[0].length; j++){
                    if(image[i][j] == -1){
                        image[i][j] = color;
                    }
                }
            }
            return image;
    }
    public void dfs(int[][] image, int sr, int sc, int row, int col, int newColor, int oldColor){
        if(sr<0 || sc<0 || sr>=row || sc>=col || image[sr][sc] != oldColor){
            return;
        }
        image[sr][sc] = -1;

        dfs(image, sr+1, sc, row, col, newColor, oldColor);
        dfs(image, sr-1, sc, row, col, newColor, oldColor);
        dfs(image, sr, sc+1, row, col, newColor, oldColor);
        dfs(image, sr, sc-1, row, col, newColor, oldColor);
    }
}