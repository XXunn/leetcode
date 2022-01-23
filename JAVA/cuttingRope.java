package leetcode;

public class cuttingRope {
    public int cuttingRope(int n) {
        int[] dp = new int[n+1];
        dp[1] = dp[2] = 1;
        for(int i = 3; i <= n; i++) {
            for(int j = 1; j < i; j++) {
                dp[i] = Math.max(Math.max(dp[j]*(i-j), dp[i]), j*(i-j));
            }
        }
        return dp[n];
    }

    // DP 优化版本
    public int cuttingRopeOpt(int n) {
        if(n <= 3) {
            // 小于3时特判
            return Math.max(1, n-1);
        }
        // dp表示 砍成两段的最大乘积 f(n) = f(n-x) * f(x)
        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;  // 此时是为 1 ， 但是计算时为 2  -> 例如 dp[4] = dp[2] * dp[2], 此时dp[2] = 2 才是正确
        dp[3] = 3;  // 所以 dp[x] 的最小值只能为 x
        // 前面三个特判, 从 4 开始
        for(int i = 4; i <= n; i++) {
            for(int j = 1; j <= i/2; j++) {
                dp[i] = Math.max(dp[i], dp[j]*dp[i-j]);
            }
        }
        return dp[n];
    }
}
