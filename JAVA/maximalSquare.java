package leetcode;

/**
 * @author szx
 * @version 1.0
 * @description: TODO
 * @date 2022/3/1 21:44
 **/
public class maximalSquare {

    public int maximalSquare(char[][] matrix) {
        int row = matrix.length, col = matrix[0].length;
        int[][] dp = new int[row][col];
        int i, j;
        int ans = 0;
        for(i = 0; i < row; ++i) {
            for(j = 0; j < col; ++j) {
                if(matrix[i][j] == '1') {
                    if (i == 0 || j == 0) {
                        dp[i][j] = 1;
                    } else {
                        dp[i][j] = Math.min(Math.min(dp[i - 1][j], dp[i][j - 1]), dp[i - 1][j - 1]) + 1;
                    }
                    ans = Math.max(ans, dp[i][j]);
                }
            }
        }
        return ans*ans;
    }

    // public int maximalSquare(char[][] matrix) {
    //     int row = matrix.length, col = matrix[0].length;
    //     int i, j;
    //     int ans = 0;
    //     for(i = 0; i < row; ++i) {
    //         for(j = 0; j < col; ++j) {
    //             if(matrix[i][j] == '1') {
    //                 int maxn = getMaxn(matrix, i, j);
    //                 if(ans < maxn) {
    //                     ans = maxn;
    //                 }
    //             }
    //         }
    //     }
    //     return ans;
    // }
    // private int getMaxn(char[][] matrix, int x, int y) {
    //     int maxn = 1;
    //     int xn = x+1, yn = y+1;
    //     while(xn < matrix.length && yn < matrix[0].length && matrix[xn][yn] == '1') {
    //         ++xn;++yn;
    //     }
    //     --xn;--yn;
    //     while(!judge(matrix, x, y, xn, yn)) {
    //         --xn;
    //         --yn;
    //     }
    //     return (xn-x+1)*(xn-x+1);
    // }
    // private boolean judge(char[][] matrix, int x, int y, int nx, int ny) {
    //     int i, j;
    //     for(i = x; i <= nx; ++i) {
    //         for(j = y; j <= ny; ++j) {
    //             if(matrix[i][j] == '0') {
    //                 return false;
    //             }
    //         }
    //     }
    //     return true;
    // }
}
