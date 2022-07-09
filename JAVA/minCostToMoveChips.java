package leetcode;

/**
 * @author szx
 * @version 1.0
 * @description: TODO
 * @date 2022/7/8 21:58
 **/
public class minCostToMoveChips {
    public int minCostToMoveChips(int[] position) {
        int odd = 0, even = 0;
        for(int cur : position) {
            if((cur & 1) == 1) {
                odd++;
            } else {
                even++;
            }
        }
        return Math.min(odd, even);
    }
}
