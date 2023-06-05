class Solution {
    public void moveZeroes(int[] nums) {
        int count=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=0 && nums.length > 1){
                nums[count] = nums[i];
                if(i!=count){
                    nums[i] = nums[i] - nums[i];
                }
                count++;
            }
        }
    }
}