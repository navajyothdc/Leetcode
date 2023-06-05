class Solution {
    public int maxSubArray(int[] nums) {
    int sum =0;
    int max =0;
    int maxNegative = Integer.MIN_VALUE;
    boolean isAllNegative = true;
    for(int i=0; i<nums.length; i++){
        sum = sum + nums[i];
        if(sum<0){
            sum=0;
        }
        if(sum>max){
            max =sum;
        }
        if(nums[i] > maxNegative && nums[i]<0){
            maxNegative = nums[i];
        } else if(nums[i]>=0){
            isAllNegative = false;
        }
    }
    if(isAllNegative){
        return maxNegative;
    }else{
        return max;
    }
}
}