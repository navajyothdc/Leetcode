class Solution {
    public int maxProfit(int[] prices) {
        int i=0;
        int j=0;
        int diff = 0;
        while(j < prices.length){
            if(prices[j] >= prices[i]){
                diff = Math.max(diff, prices[j] - prices[i]);
                j++;
            } else{
                i = j;
                j++;
            }
        }
        return diff;
    }
}