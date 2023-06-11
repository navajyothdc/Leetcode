class Solution {
    public int findMin(int[] arr) {
        int low = 0;
        int high = arr.length-1;
        int mid =0;
        while(low<=high){
            mid =(low+high)/2;
            if(arr[low]<=arr[high]){
                return arr[low];
            }
            if(low<mid && arr[mid]<arr[mid-1]){
                return arr[mid];
            }
            if(mid<high && arr[mid+1]<arr[mid]){
                return arr[mid+1];
            }
            if(arr[low]<arr[mid]){
                low = mid+1;
            } else{
                high = mid-1;
            }
        }
        return -1;
    }
}