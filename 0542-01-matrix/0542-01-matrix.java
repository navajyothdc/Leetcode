class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;
        Queue<int[]> q = new LinkedList<>();
        int [][] dist = new int[row][col];

        for(int i=0; i<row; i++){
            for(int j=0;j<col; j++){
                if(mat[i][j] == 0){
                    q.add(new int[] {i,j}); //adding the index of 0 to queue
                } else{
                    dist[i][j] = -1; 
                }
            }
        }

        int[][] dirs = {{0,1},{0,-1},{1,0},{-1,0}};//direction array to traverse in bfs

        while(!q.isEmpty()){
            int [] val = q.poll();
            int x = val[0];
            int y = val[1];
            for(int[] dir : dirs){
                int i = x + dir[0]; 
                int j = y + dir[1]; //getting element to right to x,y as i,j
                if(i>=0 && j>=0 && i < row && 
                j < col && dist[i][j] == -1){//boundary condition and checking if not visited
                    dist[i][j] = dist[x][y] + 1; 
                    q.add(new int[] {i,j}); //adding the new index to q for reaching others
                }
            }
        }

        return dist;
    }
}