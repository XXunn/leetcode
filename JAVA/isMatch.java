package leetcode;

/**
 * @author szx
 * @version 1.0
 * @description: TODO
 * @date 2022/3/5 16:32
 **/
public class isMatch {
    public boolean isMatch(String s, String p) {
        int n = p.length(), m = s.length();
        // n -> p, m -> s
        boolean[][] dp = new boolean[n+1][m+1];
        dp[0][0] = true;
        for(int i = 1; i <= n; i++) {
            if(p.charAt(i-1) != '*') {
                break;
            }
            dp[i][0] = true;
        }
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= m; j++) {
                if(p.charAt(i-1) == '*') {
                    dp[i][j] = dp[i-1][j]|dp[i][j-1];
                } else if(p.charAt(i-1) == '?') {
                    dp[i][j] = dp[i-1][j-1];
                } else if(p.charAt(i-1)==s.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1];
                }
            }
        }
        // for(int i = 0; i <= n; i++) {
        //     for(int j = 0; j <= m; j++) {
        //         System.out.print(dp[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        return dp[n][m];
    }
}
