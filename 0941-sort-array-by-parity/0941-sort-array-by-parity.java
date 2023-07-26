class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i=0;
        int j=0;
        while(i<nums.length && j<nums.length){
            if(nums[j]%2 ==0){
                j++;
            }
            if(i > j && nums[i] % 2 == 0 && j<nums.length){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            } 
            i++;
        }
        return nums;
    }
}