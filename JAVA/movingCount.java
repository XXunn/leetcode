package leetcode;

/**
 * @author szx
 * @version 1.0
 * @description: TODO
 * @date 2022/2/25 19:35
 **/
public class movingCount {
    // 经测试， 用dfs效率更高
    int[][] a;
    // boolean[][] a;
    int row, col;
    int ans = 0;
    public int movingCount(int m, int n, int k) {
        // int i, j;
        // int ans = 0;
        // a = new boolean[m][n];
        // for(i = 0; i < m ; i++) {
        //     for(j = 0; j < n; j++) {
        //         if(i == 0 || j == 0) {
        //             a[i][j] = calC(i)+calC(j) <= k;
        //         } else {
        //             a[i][j] |= a[i-1][j]|a[i][j-1];
        //         }
        //         if(a[i][j] == true) {
        //             ans++;
        //         }
        //     }
        // }
        // return ans;
        this.row = m;
        this.col = n;
        a = new int[m][n];
        dfs(0, 0, k);
        return ans;
    }
    void dfs(int x, int y, int k) {
        if(x < 0 || x >= row || y < 0 || y >= col || a[x][y] == -1 || calC(x)+calC(y)>k) {
            return;
        }
        ans++;
        a[x][y] = -1;
        dfs(x+1, y, k);
        dfs(x-1, y, k);
        dfs(x, y+1, k);
        dfs(x, y-1, k);
    }
    int calC(int x) {
        int res = 0;
        while(x != 0) {
            res += x%10;
            x/=10;
        }
        return res;
    }
}
