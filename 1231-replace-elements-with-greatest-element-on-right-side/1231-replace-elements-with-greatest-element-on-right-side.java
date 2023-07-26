class Solution {
    public int[] replaceElements(int[] arr) {
        int size = arr.length;
        int max = 0;
        max = arr[size-1];
        for(int i = size-1; i>=0; i--){
            int temp = arr[i];
            arr[i] = max;
            if(temp > max){
                max = temp;
            }
        }
        arr[size-1] = -1;
        return arr;
    }
}