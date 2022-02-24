package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author szx
 * @version 1.0
 * @description: TODO
 * @date 2022/2/24 21:07
 **/
public class longestPalindrome {
    public int longestPalindrome(String s) {
        int[] cnt = new int[128];
        int n = s.length();
        int ans = 0;
        for(int i = 0; i < n; i++) {
            cnt[s.charAt(i)]++;
        }
        for(int i = 0; i < 128; i++) {
            ans += cnt[i]/2*2;
            if(ans % 2 == 0 && cnt[i]%2 == 1) {
                ans++;
            }
        }
        return ans;
    }
    // public int longestPalindrome(String s) {
    //     char[] chars = s.toCharArray();
    //     int n = chars.length;
    //     int ans = 0;
    //     Map<Character, Integer> map = new HashMap<>();
    //     for(int i = 0; i < n; i++) {
    //         if(!map.containsKey(chars[i])) {
    //             map.put(chars[i], 1);
    //         } else {
    //             map.remove(chars[i]);
    //             ans++;
    //         }
    //     }
    //     return map.isEmpty() ? 2*ans : 2*ans+1;
    // }
}
