package leetcode;

public class maxIncreaseKeepingSkyline {
    class Solution {
        public int maxIncreaseKeepingSkyline(int[][] grid) {
            int i, j;
            int res = 0;
            // 行数或者列数
            int n = grid.length;
            // 行
            int[] row = new int[n];
            // 列
            int[] line = new int[n];
            for(i = 0; i < n; i++) {
                for(j = 0; j < n; j++) {
                    // 第i行的最大元素
                    row[i] = Math.max(row[i], grid[i][j]);
                    // 第i列的最大元素
                    line[i] = Math.max(line[i], grid[j][i]);
                }
            }
            // for(int x : row) {
            //     System.out.print(x + " ");
            // }
            // System.out.println();
            // for(int x : line) {
            //     System.out.print(x + " ");
            // }
            for(i = 0; i < n; i++) {
                for(j = 0; j < n; j++) {
                    res += Math.min(row[i], line[j])-grid[i][j];
                }
            }
            return res;
        }
    }
}
