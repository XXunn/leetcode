package leetcode;

import java.util.Map;

/**
 * @author szx
 * @version 1.0
 * @description: TODO
 * @date 2022/2/17 9:59
 **/
public class knightProbability {


    static int[][] dirs = {{-2, -1}, {-2, 1}, {2, -1}, {2, 1}, {-1, -2}, {-1, 2}, {1, -2}, {1, 2}};

    // dp[step][i][j] 表示从 i,j 出发, 走了step还在棋盘上的概率
    public double knightProbability(int n, int k, int row, int column) {
        double[][][] dp = new double[k + 1][n][n];
        for (int step = 0; step <= k; step++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (step == 0) {
                        dp[step][i][j] = 1;
                    } else {
                        for (int[] dir : dirs) {
                            int ni = i + dir[0], nj = j + dir[1];
                            if (ni >= 0 && ni < n && nj >= 0 && nj < n) {
                                dp[step][i][j] += dp[step - 1][ni][nj] / 8;
                            }
                        }
                    }
                }
            }
        }
        return dp[k][row][column];
    }


    ///**
    // * 下列代码 TLE, 可考虑记忆化搜索
    // */
    //boolean[][] mp;
    //int[][] dir = {
    //        {-1,-2,-2,-1,1,2,2,1},
    //        {2,1,-1,-2,-2,-1,1,2}
    //};
    //int n, m;
    //int ans = 0;
    //public double knightProbability(int n, int k, int row, int column) {
    //    this.n = this.m = n;
    //    mp = new boolean[n][n];
    //    dfs(row, column, 0, k);
    //    // System.out.println(ans);
    //    return ans/Math.pow(8, k);
    //}
//
    //private void dfs(int x, int y, int curStep, int AllStep) {
    //    mp[x][y] = true;
    //    // System.out.println(curStep + " " + AllStep);
    //    if(curStep == AllStep) {
    //        ans++;
    //        return;
    //    }
    //    for(int i = 0; i < 8; i++) {
    //        int nx = x + dir[0][i];
    //        int ny = y + dir[1][i];
    //        if(nx < 0 || nx >= n || ny < 0 || ny >= m) {
    //            continue;
    //        }
    //        dfs(nx, ny, curStep+1, AllStep);
    //    }
    //}
}
