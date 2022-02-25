package leetcode;

/**
 * @author szx
 * @version 1.0
 * @description: TODO
 * @date 2022/2/25 14:10
 **/
public class findNumberIn2DArray {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if(matrix == null || matrix.length==0)  return false;
        int row = matrix.length, col = matrix[0].length;
        int x = 0, y = col-1;
        while(y >= 0 && x < row) {
            if(matrix[x][y] > target) {
                y--;
                continue;
            }
            if(matrix[x][y] < target) {
                x++;
                continue;
            }
            if(matrix[x][y] == target) {
                return true;
            }
        }
        return false;
    }
}
