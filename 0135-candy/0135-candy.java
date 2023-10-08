class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int sum [] = new int[n];
        int candies = 0;
        Arrays.fill(sum, 1);
        for(int i=1; i<n; i++){
            if(ratings[i] > ratings[i-1]){
                sum[i] = sum[i-1] + 1;
            }
        }
        for(int i = n-2; i>=0; i--){
            if(ratings[i] > ratings[i+1]){
                sum[i] = Math.max(sum[i], sum[i+1] + 1);
            }
        }
        for(int i=0; i<n; i++){
            candies += sum[i];
        }
        return candies;
    }
}