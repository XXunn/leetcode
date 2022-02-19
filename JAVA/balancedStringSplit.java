package leetcode;

/**
 * @author szx
 * @version 1.0
 * @description: TODO
 * @date 2022/2/19 9:53
 **/
public class balancedStringSplit {
    public int balancedStringSplit(String s) {
        int ans = 0, n = s.length();
        int l = 0, r = 0;
        for(int i = 0; i < n; i++) {
            if(s.charAt(i) == 'L') {
                l++;
            } else {
                r++;
            }
            if(l == r) {
                ans++;
                l = r = 0;
            }
        }
        return ans;
    }
}
