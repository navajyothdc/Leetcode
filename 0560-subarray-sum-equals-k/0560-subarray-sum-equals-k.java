class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum = 0;
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,1);//for adding the first occurrence
        for(int i = 0; i < nums.length; i++){
            sum = sum + nums[i];
            if(map.containsKey(sum-k)){
                System.out.println(count);
                count = count + map.get(sum-k);
            }
            map.put(sum, map.getOrDefault(sum,0) + 1);
        }
        // System.out.println(map);
        return count;
    }
}