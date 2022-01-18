package leetcode;

public class slowestKey {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int n = releaseTimes.length;
        int index = 0;
        int maxn = releaseTimes[0];
        for(int i = 1; i < n; i++) {
            int curV = releaseTimes[i] - releaseTimes[i-1];
            if(maxn < curV) {
                index = i;
                maxn = curV;
            } else if(maxn == curV) {
                if(keysPressed.charAt(i) > keysPressed.charAt(index)) {
                    index = i;
                }
            }
        }
        return keysPressed.charAt(index);
    }
}
