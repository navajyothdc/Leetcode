class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total = 0;
        int avail = 0;
        int start = 0;

        for(int i = 0; i < gas.length; i++){
            total = total + gas[i] - cost[i];
            avail = avail + gas[i] - cost[i];
            if(avail < 0){
                avail = 0;
                start = i + 1;
            }
        }
        if(total < 0) return -1;
        else return start;
    }
}