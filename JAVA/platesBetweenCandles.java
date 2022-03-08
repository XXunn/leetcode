package leetcode;

import java.util.LinkedList;

/**
 * @author szx
 * @version 1.0
 * @description: 2055. 蜡烛之间的盘子
 *      给你一个长桌子，桌子上盘子和蜡烛排成一列。给你一个下标从 0 开始的字符串 s ，它只包含字符 '*' 和 '|' ，其中 '*' 表示一个 盘子 ，'|' 表示一支 蜡烛 。
 *      同时给你一个下标从 0 开始的二维整数数组 queries ，其中 queries[i] = [lefti, righti] 表示 子字符串 s[lefti...righti] （包含左右端点的字符）。
 *      对于每个查询，你需要找到 子字符串中 在 两支蜡烛之间 的盘子的 数目 。如果一个盘子在 子字符串中 左边和右边 都 至少有一支蜡烛，
 *      那么这个盘子满足在 两支蜡烛之间 。
 *      比方说，s = "||**||**|*" ，查询 [3, 8] ，表示的是子字符串 "*||**|" 。子字符串中在两支蜡烛之间的盘子数目为 2 ，
 *      子字符串中右边两个盘子在它们左边和右边 都 至少有一支蜡烛。
 *      请你返回一个整数数组 answer ，其中 answer[i] 是第 i 个查询的答案。
 * @date 2022/3/8 22:08
 **/
public class platesBetweenCandles {

    // 用前缀和就可以了
    // 要注意查询相邻左和右 的时候,可以用两个数组维护
    public int[] platesBetweenCandles(String s, int[][] queries) {
        if(s==null || s.equals("") || queries==null) {
            return new int[]{};
        }
        // 字符串的长度
        int slen = s.length();
        // 前缀和
        int[] preSum = new int[slen];
        int curCandles = 0;
        for(int i = 0; i < slen; i++) {
            if(s.charAt(i) == '|') {
                preSum[i] = curCandles;
            } else {
                curCandles++;
            }
        }
        // 对应左边和右边最近的下标
        int[] leftIndex = new int[slen];
        int[] rightIndex = new int[slen];
        for(int i = 0, l = -1; i < slen; i++) {
            if(s.charAt(i) == '|') {
                l = i;
            }
            leftIndex[i] = l;
        }
        for(int i = slen-1, r = -1; i >= 0; i--) {
            if(s.charAt(i) == '|') {
                r = i;
            }
            rightIndex[i] = r;
        }

        int len = queries.length;
        int[] ans = new int[len];
        for(int i = 0; i < len; ++i) {
            int left = queries[i][0], right = queries[i][1];
            int lidx = rightIndex[left], ridx = leftIndex[right];
            // System.out.println(lidx + " " + ridx);
            ans[i] = (lidx!=-1&&ridx!=-1 && lidx < ridx) ? preSum[ridx]-preSum[lidx] : 0;
        }
        return ans;
    }

    // /**
    //  * 下列代码TLE
    //  * @param s
    //  * @param queries
    //  * @return
    //  */
    // public int[] platesBetweenCandles(String s, int[][] queries) {
    //     if(s==null || s.equals("") || queries==null) {
    //         return new int[]{};
    //     }
    //     // LinkedList<Integer> list = new LinkedList<>();
    //     int len = queries.length;
    //     int[] list = new int[len];
    //     char[] candles = s.toCharArray();
    //     // for(int[] query : queries) {
    //     for(int i = 0; i < len; i++) {
    //         int left = queries[i][0], right = queries[i][1];
    //         int curSum = 0;
    //         while(left < right && candles[left] != '|') {
    //             left++;
    //         }
    //         while(left < right && candles[right] != '|') {
    //             right--;
    //         }
    //         if(candles[left]=='|' && candles[right]=='|') {
    //             for(int j = left; j <= right; j++) {
    //                 if(candles[j] == '*') {
    //                     curSum++;
    //                 }
    //             }
    //         }
    //         list[i] = curSum;
    //         // list.add(curSum);
    //     }
    //     return list;
    //     // return list.stream().mapToInt(Integer::valueOf).toArray();
    // }
}
