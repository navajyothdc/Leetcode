class Solution {
    public int[] twoSum(int[] nums, int target) {
        //BRUTE FORCE APPROACH
    //     int num[] = new int[2];
    //     for(int i=0;i<nums.length;i++){
    //             for(int j=0;j<nums.length;j++){
    //                 if(i!=j && (nums[i]+nums[j] == target)){
    //                     num[0] = i;
    //                     num[1] = j;
    //                     break;
    //                 }
    //             }
            
    //     }
    //     return num;
        
    // }
    Map<Integer, Integer> map = new HashMap<>();
    int n = nums.length;

    for(int i=0; i < n; i++){
        int x = target - nums[i];
        if(map.containsKey(x)){
            return new int[]{map.get(x),i};
        } else{
            map.put(nums[i],i);
        }
    }
    return new int[]{};
    }
}