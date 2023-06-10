class Solution {
    public int search(int[] arr, int target) {
        int low = 0;
        int high = arr.length-1;
        int mid =0;
        while(low<=high){
            mid = (low+high)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(arr[low]<=arr[mid]){
                if(arr[low]<=target && arr[mid]>=target){
                    high = mid-1;
                } else{
                    low = mid+1;
                }
            } else{
                if(arr[high] >= target && arr[mid]<=target){
                    low = mid+1;
                } else{
                     high = mid-1;
                }
            }
        }
        return -1;
    }
}