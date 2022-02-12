package leetcode;

public class numEnclaves {
    int n, m;
    public int numEnclaves(int[][] grid) {
        // n为行数， m为列数
        n = grid.length;
        m = grid[0].length;
        int ans = 0;
        // 扫描左右两列
        for(int i = 0; i < n; i++) {
            dfs(i, 0, grid);
            dfs(i, m-1, grid);
        }
        // 扫描上下两行
        for(int i = 0; i < m; i++) {
            dfs(0, i, grid);
            dfs(n-1, i, grid);
        }
        for(int i = 1; i < n;i++) {
            for(int j = 1; j < m; j++) {
                ans += grid[i][j];
            }
        }
        return ans;
    }

    // dfs, 连通块
    private void dfs(int x, int y, int[][] grid) {
        if(x < 0 || x >= n || y < 0 || y >= m || grid[x][y] == 0) {
            return;
        }
        grid[x][y] = 0;
        dfs(x+1, y, grid);
        dfs(x-1, y, grid);
        dfs(x, y+1, grid);
        dfs(x, y-1, grid);
    }
}
