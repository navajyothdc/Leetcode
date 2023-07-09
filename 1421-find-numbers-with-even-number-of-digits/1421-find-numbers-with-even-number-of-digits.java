class Solution {
    public int findNumbers(int[] nums) {
        int evenCount =0;
        int numberLength =0;
        
        for(int i=0; i<nums.length; i++){
            int temp = nums[i];
            numberLength =0;
            while(temp != 0){
                temp = temp/10;
                numberLength++;
            }
            if(numberLength%2 == 0){
                evenCount++;
            }
        }
        return evenCount;
    }
}