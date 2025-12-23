class Solution {
    public int findMaxSum(int arr[]) {
        // code here
        int n=arr.length;
        if(n==0) return 0;
        if(n==1) return arr[0];
        int[] t=new int[n+1];
        t[0]=0;
        t[1]=arr[0];
        for(int i=2;i<=n;i++){
            int steal=arr[i-1]+t[i-2];
            int skip=t[i-1];
            t[i]=Math.max(skip,steal);
            
        }
        return t[n];
        
    }
}