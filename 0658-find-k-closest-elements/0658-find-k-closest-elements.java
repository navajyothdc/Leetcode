class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int i = 0;
        int j = arr.length - 1;
        List<Integer> result = new ArrayList<>();
        while(j-i+1 > k){
            if(Math.abs(x-arr[i]) > Math.abs(x-arr[j])){
                i++;
            } else if(Math.abs(x-arr[i]) <= Math.abs(x-arr[j])){
                j--;
            }
        }
        for(int p = i; p <= j; p++){
            result.add(arr[p]);
        }
        return result;
    }
}