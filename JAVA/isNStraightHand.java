package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class isNStraightHand {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        PriorityQueue<Integer> q = new PriorityQueue<>((a, b) -> a - b);
        for(int x : hand) {
            map.put(x, map.getOrDefault(x, 0) + 1);
            q.add(x);
        }
        while(!q.isEmpty()) {
            int t = q.poll();
            if(map.get(t) == 0) {
                continue;
            }
            for(int i = 0; i < groupSize; i++) {
                int cnt = map.getOrDefault(t+i, 0);
                if(cnt == 0) {
                    return false;
                }
                map.put(t+i, cnt-1);
            }
        }
        return true;
    }
}
