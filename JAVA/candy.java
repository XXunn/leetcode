package leetcode;

import java.util.Arrays;
import java.util.Collections;

/**
 * @author szx
 * @version 1.0
 * @description: TODO
 * @date 2022/3/3 21:48
 **/
public class candy {

    public int candy(int[] ratings) {
        int n = ratings.length;
        int[] candys = new int[n];
        for(int i = 0; i < n; i++) {
            if(i > 0 && ratings[i] > ratings[i-1]) {
                candys[i] = candys[i-1]+1;
            } else {
                candys[i] = 1;
            }
        }
        int temp = 1, ans = 0;
        for(int i = n-1; i >= 0; i--) {
            if(i < n-1 && ratings[i] > ratings[i+1]) {
                temp = temp+1;
            } else {
                temp = 1;
            }
            ans += Math.max(temp, candys[i]);
        }
        return ans;
    }

    // /**
    //  * 模拟，从左往右，评分比左边多的就直接在左边糖果数量上+1
    //  * 如果左边评分高于当前的，就要对左边的区间进行更新
    //  * @param ratings
    //  * @return
    //  */
    // public int candy(int[] ratings) {
    //     int n = ratings.length;
    //     int[] candys = new int[n];
    //     Arrays.fill(candys, 1);
    //     for(int i = 1; i < n; i++) {
    //         if(ratings[i] > ratings[i-1]) {
    //             candys[i] = candys[i-1]+1;
    //         } else if(ratings[i] < ratings[i-1] && candys[i] >= candys[i-1]) {
    //             int index = i-1;
    //             int pre = i;
    //             while(index >= 0 && ratings[index] > ratings[pre] && candys[index] <= candys[pre]) {
    //                 candys[index] = candys[pre]+1;
    //                 pre = index;
    //                 index--;
    //             }
    //         }
    //     }
    //     int sum = 0;
    //     for(int v : candys) {
    //         // System.out.println(v);
    //         sum += v;
    //     }
    //     return sum;
    // }
}
