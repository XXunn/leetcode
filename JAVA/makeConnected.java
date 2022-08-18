package leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author szx
 * @version 1.0
 * @description: TODO
 * @date 2022/8/18 22:30
 **/
public class makeConnected {
    int[] parent;
    public int makeConnected(int n, int[][] connections) {
        parent = new int[n+1];
        initParent(n);
        if(n-1 > connections.length) {
            return -1;
        }
        int cnt = 0;
        for(int[] connection : connections) {
            int x = connection[0], y = connection[1];
            setP(x, y);
        }


        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < n; i++) {
            set.add(find(i));
        }
        cnt = set.size();
        return cnt-1;
    }

    private void initParent(int n) {
        for(int i = 0; i <= n; i++) {
            parent[i] = i;
        }
    }

    // 找爹函数
    int find(int x) {
        while(x != parent[x]) {
            x = parent[x] = parent[parent[x]];
        }
        return x;
    }

    void setP(int x, int y) {
        parent[find(x)] = find(y);
    }
}
