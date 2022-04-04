package leetcode;

/**
 * @author szx
 * @version 1.0
 * @description: TODO
 * @date 2022/4/4 8:22
 **/
public class uniquePathsIII {
    static int ans = 0;
    static int nums = 1;
    int[][] dir = new int[][] {
            {1, 0, -1, 0},
            {0, 1, 0, -1}
    };
    public int uniquePathsIII(int[][] grid) {
        int stx = 0, sty = 0, edx = 0, edy = 0;
        int i, j, n = grid.length, m = grid[0].length;
        for(i = 0; i < n; i++) {
            for(j = 0; j < m; j++) {
                if(grid[i][j] == 1) {
                    stx = i;
                    sty = j;
                } else if(grid[i][j] == 2) {
                    edx = i;
                    edy = j;
                } else if(grid[i][j] == 0) {
                    nums++;
                }
            }
        }
        // System.out.println(stx + " " + sty + " " + edx + " " + edy);
        grid[stx][sty] = -1;
        dfs(grid, stx, sty, edx, edy, n, m, 0);
        return ans;
    }

    private void dfs(int[][] grid, int stx, int sty, int edx, int edy, int n, int m, int cnt) {
        if(stx == edx && sty == edy && cnt == nums) {
            // System.out.println(stx + " " + sty + " " + cnt) ;
            ans++;
            return;
        } else if((stx == edx && sty == edy) || cnt > nums) {
            return;
        }

        for(int i = 0; i < 4; i++) {
            int tx = stx + dir[0][i];
            int ty = sty + dir[1][i];
            if(tx < 0 || tx >= n || ty < 0 || ty >= m || grid[tx][ty] == -1) {
                continue;
            }
            int temp = grid[tx][ty];
            grid[tx][ty] = -1;
            dfs(grid, tx, ty, edx, edy, n, m, cnt+1);
            grid[tx][ty] = temp;
        }
    }
}
