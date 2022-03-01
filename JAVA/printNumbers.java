package leetcode;

import java.util.LinkedList;

/**
 * @author szx
 * @version 1.0
 * @description: TODO
 * @date 2022/3/1 17:33
 **/
public class printNumbers {
    public int[] printNumbers(int n) {
        int Total = 1;
        while(n-- > 0) {
            Total *= 10;
        }
        Total--;
        int[] ans = new int[Total];
        for(int i = 1; i <= Total; i++) {
            ans[i-1] = i;
        }
        return ans;
    }
}
