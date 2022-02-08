package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class gridIllumination {
    // 八个方向
    int[][] dir = {
            {0,0},{0,-1},{0,1},{-1,0},{-1,-1},{-1,1},{1,0},{1,-1},{1,1}
    };
    public int[] gridIllumination(int n, int[][] lamps, int[][] queries) {
        long N =  n;
        // 照亮的情况， 分成四个hash表， 横竖， 左下和右下
        // 横竖 用 横坐标 和 纵坐标即可表示
        // 左下用 横坐标和纵坐标之和表示, 右下 用横坐标与纵坐标之差表示
        Map<Integer, Integer> row = new HashMap<>(), col = new HashMap<>();
        Map<Integer, Integer> left = new HashMap<>(), right = new HashMap<>();
        // 记录有哪些灯被记录了
        Set<Long> st = new HashSet<>();
        // 初始化灯以及照亮情况
        for(int[] lamp : lamps) {
            // 得到灯坐标
            int x = lamp[0], y = lamp[1];
            int a = x+y, b = x-y;
            // 如果这个灯被重复记录, 直接跳过
            if(st.contains(x*N + y)) {
                continue;
            }
            incre(row, x);
            incre(col, y);
            incre(left, a);
            incre(right, b);
            st.add(x*N+y);
        }
        // 查询多少次
        int l = queries.length;
        int[] ans = new int[l];
        for(int i = 0; i < l; i++) {
            int []q = queries[i];
            int x = q[0], y = q[1];
            int a = x + y, b = x - y;
            // 只要满足一个条件就可以被点亮
            if(row.containsKey(x) || col.containsKey(y) || left.containsKey(a) || right.containsKey(b)) {
                ans[i] = 1;
            }
            // 查询后就要关闭, 注意不管当前的灯是否亮, 都要关闭周围的灯
            for(int[] d : dir) {
                int nx = x + d[0], ny = y + d[1];
                int na = nx + ny, nb = nx - ny;
                // 越界直接continue
                if(nx < 0 || nx >= n || ny < 0 || ny >= n) {
                    continue;
                }
                if(st.contains(nx*N + ny)) {
                    // 移除并且关闭
                    st.remove(nx*N + ny);
                    decre(row, nx);
                    decre(col, ny);
                    decre(left, na);
                    decre(right, nb);
                }
            }
        }
        return ans;
    }

    /**
     * 插入或者增加 key
     * @param map
     * @param key
     */
    void incre(Map<Integer, Integer> map, int key) {
        map.put(key, map.getOrDefault(key, 0) + 1);
    }

    /**
     * 减少或者删除key
     * @param map
     * @param key
     */
    void decre(Map<Integer, Integer> map, int key) {
        // 如果之哟一个key, 直接移除, 否则减一
        if(map.get(key) == 1) {
            map.remove(key);
        } else {
            map.put(key, map.get(key)-1);
        }
    }
}
