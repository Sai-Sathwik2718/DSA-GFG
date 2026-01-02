// User function Template for Java//User function Template for Java
class Solution {
    public ArrayList<Integer> subsetSums(int[] arr) {
        // code here
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        ArrayList<Integer> finalans=new ArrayList<>();
        int n=arr.length;
        int total=1<<n;
        for(int i=0;i<total;i++){
            // ArrayList<Integer> res=new ArrayList<>();
            int sum=0;
            for(int j=0;j<n;j++){
                if((i&(1<<j))!=0){
                    sum+=arr[j];
                }
            }
            finalans.add(sum);
        }
        return finalans;
    }
}