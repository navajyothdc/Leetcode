class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();
    int n = numbers.length;

    for(int i=0; i < n; i++){
        int x = target - numbers[i];
        if(map.containsKey(x)){
            return new int[]{map.get(x)+1,i+1};
        } else{
            map.put(numbers[i],i);
        }
    }
    return new int[]{};
    }
}