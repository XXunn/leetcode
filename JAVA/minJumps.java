package leetcode;

import java.util.*;

public class minJumps {

    public int minJumps(int[] arr) {
        int n = arr.length;
        boolean[] vis = new boolean[n];
        Map<Integer, List<Integer>> mp = new HashMap<>();
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < n; i++) {
            mp.computeIfAbsent(arr[i], k -> new LinkedList<Integer>()).add(i);
        }
        q.add(0);   vis[0] = true;
        int ans = 0;
        while(!q.isEmpty()) {
            int l = q.size();
            for(int i = 0; i < l; i++) {
                int temp = q.poll();
                if(n - 1 == temp) {
                    return ans;
                }
                if(temp-1 >= 0 && !vis[temp-1]) {
                    q.add(temp-1);
                    vis[temp-1] = true;
                }
                if(temp+1 < n && !vis[temp+1]) {
                    q.add(temp+1);
                    vis[temp+1] = true;
                }
                if(mp.containsKey(arr[temp])) {
                    List<Integer> list = mp.remove(arr[temp]);
                    for(int x : list) {
                        if(!vis[x]) {
                            q.add(x);
                            vis[x] = true;
                        }
                    }
                }
            }
            ans++;
        }
        return n-1;
    }
//    // dp[i][j] 表示， 从 i 到 j 的最短跳跃数
//    int[][] dp;
//    public int minJumps(int[] arr) {
//        int n = arr.length;
//        dp = new int[n][n];
//        return calDp(0, n-1, arr);
//    }
//    public int calDp(int l, int r, int[] arr) {
//        if(l+1 == r || arr[l] == arr[r]) {
//            return 1;
//        }
//        if(l < 0 || r >= 0) {
//            return 0;
//        }
//        if(dp[l][r] != 0) {
//            return dp[l][r];
//        }
//        int minn = Integer.MAX_VALUE, temp = 0;
//        for(int k = l+1; k < r; k++) {
//            dp[l][k] = calDp(l, k, arr);
//            dp[k][r] = calDp(k, r, arr);
//            temp = dp[l][k] + dp[k][r];
//            minn = minn > temp ? temp : minn;
//        }
//        if(minn > 1+calDp(l-1, r ,arr)) {
//            minn = 1 + calDp(l-1, r, arr);
//        }
//        return minn;
//    }
}
