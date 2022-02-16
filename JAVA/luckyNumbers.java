package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author szx
 * @version 1.0
 * @description: TODO
 * @date 2022/2/16 20:03
 **/
public class luckyNumbers {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        // n 行 m 列
        int n = matrix.length, m = matrix[0].length;
        int i, j, k;
        for(i = 0; i < n; i++) {
            // 从第 i 行找到最小值
            int indexx = 0, nmin = 0x3f3f3f3f;
            for(j = 0; j < m; j++) {
                if(matrix[i][j] < nmin) {
                    indexx = j;
                    nmin = matrix[i][j];
                }
            }
            int flag = 0;
            for(k = 0; k < n; k++) {
                if(matrix[k][indexx] > matrix[i][indexx] && k != i) {
                    flag = 1;
                    break;
                }
            }
            if(flag == 0) {
                ans.add(matrix[i][indexx]);
            }
        }
        return ans;
    }
}
