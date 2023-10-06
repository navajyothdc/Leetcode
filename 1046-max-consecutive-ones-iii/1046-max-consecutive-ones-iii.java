class Solution {
    public int longestOnes(int[] nums, int k) {
        int i = 0;
        int j = 0;
        int flips = 0;
        int ans = 0;
        while(i < nums.length){
            if(nums[i] == 0){
                flips++;
            }
            while(flips > k){
                if(nums[j] == 0){
                    flips--;
                }
                j++;
            }
            ans = Math.max(ans, i-j+1);
            i++;
        }
        return ans;
    }
}