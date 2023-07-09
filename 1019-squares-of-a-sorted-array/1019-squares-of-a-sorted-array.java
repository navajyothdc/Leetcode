class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] resultArray = new int[nums.length];
        int index =0;
        while(index <nums.length && nums[index]<0){
            index++;
        }
        int negativeIndex = index-1;
        int outputIndex = 0;
        while(index<nums.length){
            if(negativeIndex>=0){
                int negSquare = nums[negativeIndex] * nums[negativeIndex];
                int posSquare = nums[index] * nums[index];
                if(negSquare<=posSquare){
                    resultArray[outputIndex] = negSquare;
                    outputIndex++;
                    negativeIndex--;
                } else{
                    resultArray[outputIndex] = posSquare;
                    outputIndex++;
                    index++;
                }
            } else{
                resultArray[outputIndex] = nums[index] * nums[index];
                outputIndex++;
                index++;
            }
        }
        while(negativeIndex>=0){
            resultArray[outputIndex] = nums[negativeIndex] * nums[negativeIndex];
            outputIndex++;
            negativeIndex--;
        }
    return resultArray;
    }
}