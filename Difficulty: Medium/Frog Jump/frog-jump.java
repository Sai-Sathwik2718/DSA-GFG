class Solution {
    int minCost(int[] height) {
        // code here
        int n=height.length;
        int prev=0;
        int prev1=0;
        for(int i=1;i<n;i++){
            int j1=prev+Math.abs(height[i]-height[i-1]);
            int j2=Integer.MAX_VALUE;
            if(i>1){
                j2=prev1+Math.abs(height[i]-height[i-2]);
            }
            int curr=Math.min(j1,j2);
            prev1=prev;
            prev=curr;
        }
        return prev;
    }
}