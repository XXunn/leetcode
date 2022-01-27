package leetcode;

public class numWays {
    int[] dp;
    static final int MOD = 1000000007;
    public int numWays(int n) {
        if(n == 0 || n == 1) {
            return 1;
        }
        dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;
        for(int i = 3; i <= n; i++) {
            dp[i] = (dp[i-1] +  dp[i-2]) % MOD;
        }
        return dp[n] % MOD;
    }
}
