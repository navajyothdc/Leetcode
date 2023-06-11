class Solution {
    public int[] searchRange(int[] arr, int target) {
        int low = 0;
        int high = arr.length-1;
        int mid = 0;
        int[] targetArr = {-1,-1};
        while(low <= high){
            mid =(low + high)/2;
            if(arr[mid] == target && (mid == 0 || arr[mid]>arr[mid-1])){
                targetArr[0] = mid;
                low = mid;
                high = arr.length-1;
                while(low<=high){
                    mid =(low + high)/2;
                    if(arr[mid] == target && (mid+1 == arr.length || arr[mid]<arr[mid+1]) ){
                        targetArr[1] = mid;
                        return targetArr;
                    }
                    if(arr[mid]<=target){
                        low = mid + 1;
                    } else{
                        high = mid - 1;
                    }
                    
                }
            }
            if(arr[mid]<target){
                low = mid + 1;
            } else{
                high = mid-1;
            }
        }
        return targetArr;
    }
}