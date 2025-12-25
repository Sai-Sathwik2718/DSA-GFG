class Solution {
    public int maxSumIS(int[] arr) {
        int n = arr.length;
        int[] dp = new int[n];

        // Step 1: Each element alone is a subsequence
        for (int i = 0; i < n; i++) {
            dp[i] = arr[i];
        }

        // Step 2: Build MSIS values
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i]) {
                    dp[i] = Math.max(dp[i], arr[i] + dp[j]);
                }
            }
        }

        // Step 3: Find maximum sum
        int ans = 0;
        for (int val : dp) {
            ans = Math.max(ans, val);
        }

        return ans;
    }
}
