package leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author szx
 * @version 1.0
 * @description: TODO
 * @date 2022/2/21 16:52
 **/
public class pushDominoes {
    public String pushDominoes(String dominoes) {
        int n = dominoes.length();
        char[] ds = dominoes.toCharArray();
        int[] cnt = new int[n];
        Deque<int[]> d = new ArrayDeque<>();
        for(int i = 0; i < n; i++) {
            if(ds[i] == '.') {
                continue;
            }
            int dir = ds[i] == 'L' ? -1 : 1;
            // 队列插入 ： 下标， 受力次数， 受力方向
            d.add(new int[]{i, 1, dir});
            // 标记被访问过一次
            cnt[i] = 1;
        }
        // BFS
        while(!d.isEmpty()) {
            int[] temp = d.pollFirst();
            int index = temp[0], time = temp[1], dir = temp[2];
            // 新坐标
            int newIndex = index + dir;
            // 如果之前为 .    或者新的下标越界
            if(ds[index] == '.' || (newIndex < 0 || newIndex >= n)) {
                continue;
            }
            // 如果没有被访问过
            if(cnt[newIndex] == 0) {
                d.addLast(new int[]{newIndex, time+1, dir});
                cnt[newIndex] = time+1;
                ds[newIndex] = dir == -1 ? 'L' : 'R';
            } else if(cnt[newIndex] == time+1) {
                ds[newIndex] = '.';
            }
        }
        return String.valueOf(ds);
    }
}
