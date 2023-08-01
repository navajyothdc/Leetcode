class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        int n= nums.length;
        int mod = 1000000007;
        for(int i: nums){
            sum += i;
        }
        if(sum % 2 != 0 ) return false;
        else sum = sum/2;
        int dp[][] = new int[nums.length+1][sum+1];
        for(int i=0; i<=n; i++){
            dp[i][0] = 1;
        }
        for(int i=1; i<=n; i++){
            for(int j=0; j<=sum; j++){
                if(j>=nums[i-1]){
                    dp[i][j] = (dp[i-1][j] + dp[i-1][j-nums[i-1]]) % mod;
                } else{
                    dp[i][j] = (dp[i-1][j])%mod;
                }
            }
        }
        System.out.println(sum);
        System.out.println(dp[n][sum]);
        if(dp[n][sum] >= 2) return true;
        else return false;
    }
}