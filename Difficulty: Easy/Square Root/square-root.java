class Solution {
    int floorSqrt(int n) {
        // code here
        int low=1,high=n;
        while(low<=high){
            long mid=(low+high)/2;
            long val=mid*mid;
            if(val<=(long)n){
                low=(int)mid+1;
            }else{
                high=(int)mid-1;
            }
        }
        return high;
    }
    
}