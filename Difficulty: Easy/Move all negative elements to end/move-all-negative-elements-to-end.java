// User function Template for Java

class Solution {
    public void segregateElements(int[] arr) {
        // Your code goes here
        int n=arr.length;
        int[] ans=new int[n];
        int ind=0;
        for(int i=0;i<n;i++){
            if(arr[i]>=0){
                ans[ind++]=arr[i];
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                ans[ind++]=arr[i];
            }
        }
        for(int i=0;i<n;i++){
            arr[i]=ans[i];
        }
        
        
        
    }
}