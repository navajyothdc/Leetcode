class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int left = 0;
        int top = 0;
        int right = matrix[0].length-1;
        int down = matrix.length-1;
        //l->r
        List<Integer> result = new ArrayList<>();
        while(left<=right && top<=down){
        for(int i=left; i<=right; i++){
            result.add(matrix[top][i]);
        }
        top++;
        //t->d
        for(int i=top; i<=down; i++){
            result.add(matrix[i][right]);
        }
        right--;
        //r->l
        if(top<=down){
            for(int i=right; i>=left; i--){
                result.add(matrix[down][i]);
            }
            down--;
        }
        //d->t
        if(left<=right){
            for(int i=down; i>=top; i--){
                result.add(matrix[i][left]);
            }
            left++;
        }
    }
    return result;
    }
}