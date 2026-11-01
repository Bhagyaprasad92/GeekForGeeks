class Solution {
  public:
    int derangeCount(int n) {
        // code here
        int dp[n + 2];
        dp[0] = 1;
        dp[1] = 0;
        for(int i = 2; i <= n; i++) {
            dp[i] = (i - 1) * (dp[i - 1] + dp[i - 2]);
        }
        return dp[n];
    }
};