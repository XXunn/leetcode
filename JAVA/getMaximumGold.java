package leetcode;

public class getMaximumGold {
    /**
     * 优化， 如果一个点，他旁边有多余两个点不为0， 那么这个点一定不能作起点
     * @param grid
     * @return
     */
    public int getMaximumGold(int[][] grid) {
        int n = grid.length, m = grid[0].length;
        int maxn = 0;
        int i, j;
        for(i = 0; i < n; i++) {
            for(j = 0; j < m; j++) {
                if(grid[i][j] == 0) {
                    continue;
                }
                int canBeUsedAsStart = 0;
                if(i > 0 && grid[i-1][j]!=0)    canBeUsedAsStart++;
                if(j > 0 && grid[i][j-1]!=0)    canBeUsedAsStart++;
                if(i+1<n && grid[i+1][j]!=0)    canBeUsedAsStart++;
                if(j+1<m && grid[i][j+1]!=0)    canBeUsedAsStart++;
                if(canBeUsedAsStart <= 2) {
                    maxn = Math.max(maxn, dfs(i, j, n, m, grid));
                }
            }
        }
        return maxn;
    }

    private int dfs(int x, int y, int n, int m, int[][] grid) {
        if(x < 0 || x >= n || y < 0 || y >= m || grid[x][y]==0) {
            return 0;
        }
        int temp = grid[x][y];
        grid[x][y] = 0;
        int res = dfs(x+1, y, n, m, grid);
        res = Math.max(res, dfs(x, y+1, n, m, grid));
        res = Math.max(res, dfs(x-1, y, n, m, grid));
        res = Math.max(res, dfs(x, y-1, n, m, grid));
        res += temp;
        grid[x][y] = temp;
        return res;
    }
    /**
     * 下面的代码能A， 但是效率不高
     */
    // int n, m;
    // int ans = 0;
    // int dir[][] = {
    //         {0, 0, -1, 1},
    //         {1, -1, 0, 0}
    // };
    // boolean[][] vis;
    // public int getMaximumGold(int[][] grid) {
    //     n = grid.length;
    //     m = grid[0].length;
    //     int i, j;
    //     vis = new boolean[n][m];
    //     int curValue = 0;
    //     for(i = 0; i < n ;i++) {
    //         for(j = 0; j < m; j++) {
    //             if(grid[i][j] != 0) {
    //                 dfs(i, j, 0, grid);
    //             }
    //         }
    //     }
    //     return ans;
    // }
//
    // private void dfs(int x, int y, int curValue, int[][] grid) {
    //     curValue += grid[x][y];
    //     vis[x][y] = true;
    //     ans = Math.max(ans, curValue);
    //     for(int k = 0; k < 4; k++) {
    //         int nx = x + dir[0][k];
    //         int ny = y + dir[1][k];
    //         if(nx < 0 || nx >= n || ny < 0 || ny >= m || vis[nx][ny] == true || grid[nx][ny]==0) {
    //             continue;
    //         }
    //         dfs(nx, ny, curValue, grid);
    //     }
    //     vis[x][y] = false;
    // }
}
