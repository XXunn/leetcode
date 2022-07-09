package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author szx
 * @version 1.0
 * @description: TODO
 * @date 2022/7/9 13:40
 **/
public class lenLongestFibSubseq {

    // dp[j][i] 表示 以  【j】 【i】  结尾的  串的最长长度
    public int lenLongestFibSubseq(int[] arr) {
        int ans = 0;
        Map<Integer, Integer> searchMap = new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
            searchMap.put(arr[i], i);
        }
        int len = arr.length;
        int[][] dp = new int[len+1][len+1];
        for(int i = 0; i < len ;i++) {
            for(int j = i-1; j >= 0 && 2*arr[j] > arr[i]; j--) {
                int idx = searchMap.getOrDefault(arr[i] - arr[j], -1);
                if(idx >= 0) {
                    dp[j][i] = Math.max(dp[idx][j]+1, 3);
                }
                ans = Math.max(ans, dp[j][i]);
            }
        }
        return ans;
    }

}
