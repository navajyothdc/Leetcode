class Solution {
    public int sumFourDivisors(int[] nums) {
        int ans = 0;
        List<Integer> val = new ArrayList<>();
        int sum = 0;
        int totalSum=0;
        for(int j=0; j< nums.length; j++){
        ans=0;
        sum=0;
        for(int i=1; i<= Math.sqrt(nums[j]); i++){
            if(nums[j]%i == 0){
                if(nums[j]/i == i){
                    ans++;
                    sum = sum + i;
                } else{
                    ans = ans+2;
                    sum = sum + i + nums[j]/i;
                }
            }
        }
        if(ans == 4){
            totalSum = totalSum + sum;
        }
        }
    return totalSum;
    }
}