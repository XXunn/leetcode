package leetcode;

/**
 * @author szx
 * @version 1.0
 * @description: TODO
 * @date 2022/2/28 10:18
 **/
public class spiralOrder {

    public int[] spiralOrder(int[][] matrix) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return new int[]{};
        }
        int up = 0, down = matrix.length-1, left = 0, right = matrix[0].length-1;
        int num = matrix.length * matrix[0].length, curIndex = 0;
        int[] ans = new int[num];
        while(curIndex < num) {
            for(int i = left; i <= right && curIndex < num; i++) {
                ans[curIndex++] = matrix[up][i];
            }
            for(int i = up+1; i <= down && curIndex < num; i++) {
                ans[curIndex++] = matrix[i][right];
            }
            for(int i = right-1; i >= left && curIndex < num; i--) {
                ans[curIndex++] = matrix[down][i];
            }
            for(int i = down-1; i >= up+1 && curIndex < num; i--) {
                ans[curIndex++] = matrix[i][left];
            }
            up++;
            right--;
            left++;
            down--;
        }
        return ans;
    }

    // private int[][] dir = {
    //         {0, 1, 0, -1},
    //         {1, 0, -1, 0}
    // };
    // public int[] spiralOrder(int[][] matrix) {
    //     if(matrix == null || matrix.length == 0 || matrix[0].length == 0) {
    //         return new int[]{};
    //     }
    //     int row = matrix.length, col = matrix[0].length;
    //     // 一共有nums个元素
    //     int nums = row * col;
    //     boolean[][] vis = new boolean[row][col];
    //     int[] ans = new int[nums];
    //     // 访问到了第几个元素写入ans数组
    //     int curIndex = 0;
    //     // 当前方向
    //     int dirIndex = 0;
    //     // 当前访问到的坐标
    //     int x = 0, y = 0;
    //     while(curIndex < nums) {
    //         // System.out.println(curIndex + " " + x + " " + y);
    //         ans[curIndex++] = matrix[x][y];
    //         vis[x][y] = true;
    //         x += dir[0][dirIndex];
    //         y += dir[1][dirIndex];
    //         if(x < 0 || x >= row || y < 0 || y >= col || vis[x][y] == true) {
    //             x -= dir[0][dirIndex];
    //             y -= dir[1][dirIndex];
    //             dirIndex = (dirIndex + 1) % 4;
    //             x += dir[0][dirIndex];
    //             y += dir[1][dirIndex];
    //         }
//
    //     }
    //     return ans;
    // }
}
