class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int ans = 0;
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }
        for(int i = 0; i < nums.length; i++){
            if(!set.contains(nums[i] - 1)){//finding the smallest element in the sequence
                int temp = nums[i];
                int sequenceCount = 1;
                while(set.contains(temp + 1)){//finding the count of the current sequence
                    temp++;
                    sequenceCount++;
                }
                ans = Math.max(ans, sequenceCount);
            }
            if(ans > nums.length/2) break;
        }
        return ans;
    }
}