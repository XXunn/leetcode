package leetcode;

import javafx.util.Pair;

import java.util.ArrayDeque;
import java.util.Queue;

public class highestPeak {
    // 多源 BFS， 思路简单， 主要是实现
    // 方向数组
    static final int NON_VIS = -1;
    int Ori[][] = new int[][]{
            {1, -1, 0, 0},
            {0, 0, 1, -1}
    };

    public int[][] highestPeak(int[][] isWater) {
        int n = isWater.length, m = isWater[0].length;
        int[][] res = new int[n][m];
        // 循环变量
        int i, j;
        for(i = 0; i < n; i++) {
            for(j = 0; j < m; j++) {
                res[i][j] = NON_VIS;
            }
        }
        // boolean[][] vis = new boolean[n][m];
        Queue<int[]> q = new ArrayDeque<int[]>();
        for(i = 0; i < n; i++) {
            for(j = 0; j < m; j++) {
                if(isWater[i][j] == 1) {
                    // 入水
                    q.add(new int[]{i, j});
                    res[i][j] = 0;
                    // vis[i][j] = true;
                }
            }
        }
        int tempx, tempy;
        while(!q.isEmpty()) {
            // 弹出队受
            int[] temp = q.poll();
            // 四个方向
            for(i = 0; i < 4; i++) {
                tempx = temp[0] + Ori[0][i];
                tempy = temp[1] + Ori[1][i];
                if(tempx < 0 || tempx >= n || tempy < 0 || tempy >= m || res[tempx][tempy]!=NON_VIS ) {
                    continue;
                } else {
                    res[tempx][tempy] = res[temp[0]][temp[1]] + 1;
                    q.add(new int[]{tempx, tempy});
                    // vis[tempx][tempy] = true;
                }
            }
        }
        return res;
    }

    // 已AC， 但是其中的 vis数组可以进一步优化
    // public int[][] highestPeak(int[][] isWater) {
    //     int n = isWater.length, m = isWater[0].length;
    //     int[][] res = new int[n][m];
    //     boolean[][] vis = new boolean[n][m];
    //     Queue<int[]> q = new ArrayDeque<int[]>();
    //     for(int i = 0; i < n; i++) {
    //         for(int j = 0; j < m; j++) {
    //             if(isWater[i][j] == 1) {
    //                 // 入水
    //                 q.add(new int[]{i, j});
    //                 vis[i][j] = true;
    //             }
    //         }
    //     }
    //     int tempx, tempy;
    //     while(!q.isEmpty()) {
    //         // 弹出队受
    //         int[] temp = q.poll();
    //         // 四个方向
    //         for(int i = 0; i < 4; i++) {
    //             tempx = temp[0] + Ori[0][i];
    //             tempy = temp[1] + Ori[1][i];
    //             if(tempx < 0 || tempx >= n || tempy < 0 || tempy >= m || vis[tempx][tempy]==true ) {
    //                 continue;
    //             } else {
    //                 res[tempx][tempy] = res[temp[0]][temp[1]] + 1;
    //                 q.add(new int[]{tempx, tempy});
    //                 vis[tempx][tempy] = true;
    //             }
    //         }
    //     }
    //     return res;
    // }
}
