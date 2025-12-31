class Solution {
    public int reverseExponentiation(int n) {
        // code here
        int org=n;
        int rev=0;
        while(n!=0){
            int digit=n%10;
            rev=rev*10+digit;
            n=n/10;
        }
        int g=(int)Math.pow(org,rev);
        return g;
    }
}
