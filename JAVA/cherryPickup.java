package leetcode;

/**
 * @author szx
 * @version 1.0
 * @description: TODO
 * @date 2022/7/10 20:48
 **/
public class cherryPickup {
    static int N = 55;
    static int[][][] dp = new int[N*2][N][N];

    public int cherryPickup(int[][] grid) {
        int len = grid.length;

        for(int k = 0; k <= 2*len; k++) {
            for(int i1 = 0; i1 <= len; i1++) {
                for(int i2 = 0; i2 <= len; i2++) {
                    dp[k][i1][i2] = Integer.MIN_VALUE;
                }
            }
        }
        dp[2][1][1] = grid[0][0];
        for(int k = 3; k <= 2*len; k++) {
            for(int i1 = 1; i1 <= len; i1++) {
                for(int i2 = 1; i2 <= len; i2++) {
                    int j1 = k - i1, j2 = k - i2;
                    if(j1 <= 0 || j1 > len || j2 <= 0 || j2 > len) {
                        continue;
                    }
                    int A = grid[i1-1][j1-1], B = grid[i2-1][j2-1];
                    if(A == -1 || B == -1) {
                        continue;
                    }
                    int a = dp[k-1][i1-1][i2], b = dp[k-1][i1-1][i2-1],
                            c = dp[k-1][i1][i2], d = dp[k-1][i1][i2-1];
                    int t = Math.max(Math.max(Math.max(a, b), c), d) + A;
                    if(i1 != i2) {
                        t += B;
                    }
                    dp[k][i1][i2] = t;
                }
            }
        }
        return dp[2*len][len][len] == -2 ? 0 :dp[2*len][len][len];
    }

}
