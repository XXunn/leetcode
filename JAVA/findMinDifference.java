package leetcode;

import java.util.Collections;
import java.util.List;

public class findMinDifference {
    static final int maxMinute = 1440;
    public int findMinDifference(List<String> timePoints) {
        int n = timePoints.size();
        if(n > maxMinute) {
            return 0;
        }
        Collections.sort(timePoints);
        int cur = convertTimeToInt(timePoints.get(0));
        int last = 0, ans = Integer.MAX_VALUE;
        for(int i = 1; i < n; i++) {
            last = cur;
            cur = convertTimeToInt(timePoints.get(i));
            ans = Math.min(ans, cur -last);
        }
        ans = Math.min(ans, maxMinute + convertTimeToInt(timePoints.get(0)) - cur);
        return ans;
    }
    int convertTimeToInt(String s) {
        String[] split = s.split(":");
        int H = Integer.parseInt(split[0]);
        int M = Integer.parseInt(split[1]);
        return 60*H + M;
    }
}
