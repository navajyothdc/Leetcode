class Solution {
    public void rotate(int[][] matrix) {
        for(int col = 0;col < matrix[0].length; col++){
            for(int row = 0; row < matrix.length/2; row++) {
                int temp = matrix[row][col];
                matrix[row][col] = matrix[matrix.length - row - 1][col];
                matrix[matrix.length - row - 1][col] = temp;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
        for (int j = i; j < matrix[0].length; j++) {
            int data = matrix[i][j];
            matrix[i][j] = matrix[j][i];
            matrix[j][i] = data;
        }
        }
    }
}