package leetcode;

public class removeBoxes {
    // 最开始想的是贪心, 每次选连着最长的, 但是这个想法不行 比如:
    // 1 3 2 2 2 3 4 3 1
    // 1 3 0 0 0 3 4 3 1
    // 1 0 0 0 0 0 4 3 1  -> (这里有问题, 应该先取出4, 然后三个3一起取出)
    // 后面想到是dp, 看了下居然是一年前写的, 但是之前写的代码如今会TLE
    int [][][]dp;
    public int removeBoxes(int[] boxes) {
        int l = boxes.length;
        dp = new int[l][l][l];
        return calDpOpt(0, l-1, 0, boxes);
    }

    public int calDp(int l, int r, int k, int[] boxes) {
        if(l > r) {
            return 0;
        }
        if(dp[l][r][k] == 0) {  // dp!=0的话, 说明已经被更新掉了, 就不管
            // 先考虑, 把 r 以及后面 k 位一样的值为r 全拿出来
            dp[l][r][k] = calDp(l, r-1, 0, boxes) + (k+1)*(k+1);
            for(int i = l; i < r; i++) {
                if(boxes[i] == boxes[r]) {
                    // 只有 中间 和 后面的 r 相等时, 才考虑切分区间
                    // [l, r] -> [l, i] (i+1, r-1) r
                    // 其中 i 和 r 可以连一起
                    dp[l][r][k] = Math.max(dp[l][r][k],
                            calDp(i+1, r-1, 0, boxes) + calDp(l, i, k+1, boxes));
                }
            }
        }
        return dp[l][r][k];
    }

    public int calDpOpt(int l, int r, int k, int[] boxes) {
        // 优化版本
        if(l > r) {
            return 0;
        }
        if(dp[l][r][k] == 0) {  // dp!=0的话, 说明已经被更新掉了, 就不管
            // 先考虑, 把 r 以及后面 k 位一样的值为r 全拿出来
            // 优化: 可以把 r 以及 r 左边连起来的和 r 相同的搞成一坨
            // rt: 往左边找到的最远和 r 相同的下标
            // kt: 相对应增加的距离
            int rt = r, kt = k;
            while(rt > l && boxes[rt] == boxes[rt-1]) {
                rt--;
                kt++;
            }
            // 现在 从 rt到 r, 以及 r 后面与 r 相等的, 可以一并计算了
            dp[l][r][k] = calDpOpt(l, rt-1, 0, boxes) + (kt+1)*(kt+1);
            for(int i = l; i < rt; i++) {
                if(boxes[i] == boxes[rt]) {
                    // ... [ l .. .. i  .. .. ..  (rt .. r) ......]
                    //切成             i+1 .. rt-1                和
                    //    [ l .. .. i            (rt .. r) ......]
                    dp[l][r][k] = Math.max(dp[l][r][k],
                            calDpOpt(i+1, rt-1, 0, boxes) + calDpOpt(l, i, kt+1, boxes));
                }
            }
        }
        return dp[l][r][k];
    }

}
