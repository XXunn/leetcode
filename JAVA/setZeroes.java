package leetcode;

/**
 * @author szx
 * @version 1.0
 * @description: TODO
 * @date 2022/3/2 8:42
 **/
public class setZeroes {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length, col = matrix[0].length;
        boolean[] rowF = new boolean[row];
        boolean[] colF = new boolean[col];
        int i, j;
        for(i = 0; i < row; i++) {
            for(j = 0; j < col; j++) {
                if(matrix[i][j] == 0) {
                    rowF[i] = colF[j] = true;
                }
            }
        }
        for(i = 0; i < row; i++) {
            for(j = 0; j < col; j++) {
                if(rowF[i]||colF[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

}
