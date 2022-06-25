package leetcode;

/**
 * @author szx
 * @version 1.0
 * @description: TODO
 * @date 2022/6/25 19:10
 **/
public class minCost {

    /*
    假如有一排房子，共 n 个，每个房子可以被粉刷成红色、蓝色或者绿色这三种颜色中的一种，
    你需要粉刷所有的房子并且使其相邻的两个房子颜色不能相同。
    当然，因为市场上不同颜色油漆的价格不同，所以房子粉刷成不同颜色的花费成本也是不同的。
    每个房子粉刷成不同颜色的花费是以一个 n x 3 的正整数矩阵 costs 来表示的。
    例如，costs[0][0] 表示第 0 号房子粉刷成红色的成本花费；costs[1][2] 表示第 1 号房子粉刷成绿色的花费，以此类推。
    请计算出粉刷完所有房子最少的花费成本。
    链接：https://leetcode.cn/problems/JEj789
     */

    /**
     * dp即可
     * @param costs
     * @return
     */
    public int minCost(int[][] costs) {
        if(costs.length == 0 || costs == null) {
             return 0;
        }
        int len = costs.length;
        for(int i = 1; i < len; i++) {
            for(int j = 0; j < 3; j++) {
                int min = 0x3f3f3f;
                for(int k = 0; k < 3; k++) {
                     if(j != k) {
                         min = Math.min(min, costs[i][j] + costs[i-1][k]);
                     }
                }
                costs[i][j] = min;
            }
        }
        return Math.min(Math.min(costs[len-1][0], costs[len-1][1]), costs[len-1][2]);
    }

}
