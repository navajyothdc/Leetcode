
class Solution {
    public int mySqrt(int x) {
        long high = x/2;
        long low = 1;
        long mid = 0;
        if(x==1)return 1;

        while(low<=high){
            mid = (low+high)/2;
            if(mid*mid == x){
                return (int)mid;
            }
            if(x > mid*mid && x <(mid+1)*(mid+1) ){
                return (int)mid;
            }
            if(mid*mid < 0 || mid*mid > x){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return (int)mid;
}
    
}