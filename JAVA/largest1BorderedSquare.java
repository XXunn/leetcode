package leetcode;

/**
 * @author szx
 * @version 1.0
 * @description: TODO
 * @date 2022/6/5 13:10
 **/
public class largest1BorderedSquare {
    /**
     *
    // 暴力， 从最左上角直接找， 耗时多
    public int largest1BorderedSquare(int[][] grid) {
        int n = grid.length, m = grid[0].length;
        int ans = 0, flag = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(grid[i][j] == 1) {
                    flag = 1;
                }
                int cnt = 1;
                while(i+cnt < n && j+cnt < m) {
                    if(judge(grid, i, j, i+cnt, j+cnt)) {
                        // System.out.println("OK  " + i + " " + j + " " + cnt);
                        ans = Math.max(ans, cnt+1);
                    }
                    cnt++;
                }
            }
        }
        return ans == 0 ? flag : ans*ans;
    }
    boolean judge(int[][] grid, int stx, int sty, int edx, int edy) {
        int i, j;
        for(i = stx; i <= edx; i++) {
            for(j = sty; j <= edy; j++) {
                if(i > stx && i < edx && j > sty && j < edy) {
                    continue;
                }
                if(grid[i][j] != 1) {
                    return false;
                }
            }
        }
        return true;
    }
     */

    // 思路：前缀和
    public int largest1BorderedSquare(int[][] grid) {
        if(grid==null) {
            return 0;
        }
        // n行m列
        int n = grid.length, m = grid[0].length;
        // dp[x][y][0] 代表坐标xy左边有多少连续1
        // dp[x][y][1] 代表坐标xy上边有多少连续1
        int dp[][][] = new int[n+1][m+1][2];
        int ans = 0;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= m; j++) {
                if(grid[i-1][j-1] == 1) {
                    // 如果是1 , 就更新右边和下面的dp数组
                    dp[i][j][0] = dp[i][j-1][0] + 1;
                    dp[i][j][1] = dp[i-1][j][1] + 1;
                    int len = Math.min(dp[i][j][0], dp[i][j][1]);
                    // 此时一个正方形的下面和右边已经满足条件, 需要验证他的上边和左边
                    while (len > 0) {
                        if(dp[i-len+1][j][0] >= len && dp[i][j-len+1][1] >= len) {
                            break;
                        }
                        len--;
                    }
                    ans = Math.max(ans, len);
                }
            }
        }
        return ans*ans;
    }
}
