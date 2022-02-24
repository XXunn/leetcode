package leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * @author szx
 * @version 1.0
 * @description: 1706. 球会落何处
 * @date 2022/2/24 11:26
 **/
public class findBall {
    public int[] findBall(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int[] ans = new int[col];
        Arrays.fill(ans, -1);
        int i, j;
        // System.out.println("row: " + row + " col: " + col);
        for(j = 0; j < col; j++) {
            // System.out.println("test!");
            // 当前列数
            int curCol = j;
            // System.out.println("curJ: " + j + " Col " + col);
            for(i = 0; i < row; i++) {
                int dir = grid[i][curCol];
                // System.out.println(" ***" + dir + " CurCol:" + curCol + " j:" + j);
                // 模拟小球的行走
                curCol += dir;
                if(curCol < 0 || curCol == col || grid[i][curCol] != dir) {
                    curCol = -1;
                    break;
                }
            }
            if(col >= 0) {
                ans[j] = curCol;
            }
        }
        return ans;
    }
}
