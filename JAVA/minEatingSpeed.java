package leetcode;

import java.util.Arrays;

/**
 * @author szx
 * @version 1.0
 * @description: TODO
 * @date 2022/6/7 22:38
 **/
public class minEatingSpeed {

    public int minEatingSpeed(int[] piles, int h) {
        if(piles == null || piles.length == 0) {
            return 0;
        }
        // 二分 ， 最少吃一个， 最多吃最多的那个, 找出最多的那一个赋值给 r
        int l = 1, r = 0;
        for(int i = 0; i < piles.length; i++) {
            if(r < piles[i]) {
                r = piles[i];
            }
        }
        // 二分
        while(l < r) {
            int mid = (l+r) / 2;
            if(judge(piles, h, mid)) {
                // 此时能吃完, 也就要缩小有边界
                r = mid;
            } else {
                l = mid+1;
            }
        }
        return r;
    }

    // 判断每小时吃 k 个, 是否满足需求
    boolean judge(int[] piles, int h, int k){
        // 耗时
        int times = 0;
        for(int pile : piles) {
            if(pile%k==0) {
                times += pile/k;
            } else {
                times += pile/k;
                times += 1;
            }
        }
        return times <= h;
    }

}
