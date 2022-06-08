package leetcode;

/**
 * @author szx
 * @version 1.0
 * @description: TODO
 * @date 2022/6/8 21:59
 **/
public class isBoomerang {
    // 若两个向量不在同一条直线上，则叉积不为0
    public boolean isBoomerang(int[][] points) {
        return (points[2][1]-points[0][1])*(points[2][0]-points[1][0]) != (points[2][0]-points[0][0])*(points[2][1]-points[1][1]);
    }
}
