class Solution {
    public static int countDigits(int n) {
        // Code here
        int cnt=0;
        int org=n;
        while(n!=0){
            int rem=n%10;
            cnt+=1;
            n=n/10;
        }
        return cnt;
    }
}
