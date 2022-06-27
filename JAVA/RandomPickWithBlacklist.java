package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

/**
 * @author szx
 * @version 1.0
 * @description: TODO
 * @date 2022/6/26 20:02
 **/
public class RandomPickWithBlacklist {

    // n 为总数量, m为黑名单数量
    // 思路: 将所有元素分为两部分,  前面 n-m 与后面 m 个
    // 从 0 ~ n-m 随机roll , 如果是白名单的直接返回白名单, 如果是黑名单的就映射到 后面 m 个中的白名单

    HashMap<Integer, Integer> hsMap = new HashMap<>();
    // 存放黑名单
    HashSet<Integer> hsSet = new HashSet<>();
    // n 为总数量, m为黑名单数量
    int n, m, bound;
    Random random = new Random();
    public RandomPickWithBlacklist(int n, int[] blacklist) {
        this.n = n;
        this.m = blacklist.length;
        bound = n-m;
        for(int element : blacklist) {
            if(element >= bound) {
                hsSet.add(element);
            }
        }
        int w = bound;
        for(int element : blacklist) {
            if(element < bound) {
                while(hsSet.contains(w)) {
                    w++;
                }
                hsMap.put(element, w);
                w++;
            }
        }
    }

    public int pick() {
        int rand = random.nextInt(bound);
        return hsMap.getOrDefault(rand, rand);
    }


    // 用该方法可能会超时， 比如 1-10000，只有 5这个数字 不在黑名单中
    // 那么每次选择的只能为5 , 而如果随机选择的话, 就会超时
    // int n = 0;
    // HashSet<Integer> hset = new HashSet<>();
    // Random random = new Random();
    // public RandomPickWithBlacklist(int n, int[] blacklist) {
    //     this.n = n;
    //     for(int element : blacklist) {
    //         hset.add(element);
    //     }
    // }
    // public int pick() {
    //     int curElement = 0;
    //     while(true) {
    //         curElement = random.nextInt(n);
    //         if(!hset.contains(curElement)) {
    //             break;
    //         }
    //     }
    //     return curElement;
    // }

}
