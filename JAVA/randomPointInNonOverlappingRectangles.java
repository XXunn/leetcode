package leetcode;

import java.util.Random;

/**
 * @author szx
 * @version 1.0
 * @description: TODO
 * @date 2022/6/9 20:36
 **/
public class randomPointInNonOverlappingRectangles {

    int [][] rects;
    int n;
    Random random;

    public randomPointInNonOverlappingRectangles(int[][] rects) {
        this.rects = rects;
        n = rects.length;
        random = new Random();
    }
    // 蓄水池抽样
    public int[] pick() {
        // 总和， 当前正方形面积， 所选下标
        int curSum = 0,cur = 0, index = 0;

        for(int i = 0; i < n; i++) {
            // 计算点数： 当前正方形点数 和 总点数
            cur = (rects[i][2] - rects[i][0] + 1) * (rects[i][3] - rects[i][1] + 1);
            curSum += cur;
            // 蓄水池抽样, 每次抽取 random , 之前的就不管, 在后面的就抽后面的
            if (random.nextInt(curSum + 1) < cur) {
                index = i;
            }
        }
        // 最后抽到的点
        int x1 = rects[index][0], y1 = rects[index][1], x2 = rects[index][2], y2 = rects[index][3];
        return new int[] {x1+random.nextInt(x2-x1+1), y1+random.nextInt(y2-y1+1)};

    }
}
