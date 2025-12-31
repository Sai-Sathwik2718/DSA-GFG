class Solution {
    int sumExceptFirstLast(int[] arr) {
        // your code here
        int a=0;
        if(arr.length<=2) return 0;
        for(int i=1;i<arr.length-1;i++){
            a+=arr[i];
        }
        return a;
    }
}