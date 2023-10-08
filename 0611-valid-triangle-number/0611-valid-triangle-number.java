class Solution {
    public int triangleNumber(int[] nums) {
        int count = 0;
        Arrays.sort(nums);
        for(int c = nums.length-1; c>=2; c--){
            int a = 0;
            int b = c-1;
            while(a < b){
                if(nums[a] + nums[b] > nums[c]){
                    count = count + b - a;
                    b--;
                } else{
                    a++;
                }
            }
        }
        return count;
    }
}