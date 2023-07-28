class Solution {
    public int thirdMax(int[] arr) {
        long max1=Long.MIN_VALUE;
        long max2=Long.MIN_VALUE;
        long max3=Long.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max1 ){
                max3=max2;
                max2=max1;
                max1 = arr[i];
            } else if(arr[i] > max2 && arr[i]<max1){
                max3 = max2;
                max2 = arr[i];
            } else if(arr[i] > max3 && arr[i]<max2){
                max3 = arr[i];
            }
        }
        return max3 == Long.MIN_VALUE? (int)max1 : (int)max3;
        
    }
}