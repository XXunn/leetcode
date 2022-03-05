package leetcode;

/**
 * @author szx
 * @version 1.0
 * @description: TODO
 * @date 2022/3/3 19:26
 **/
public class characterReplacement {
    public int characterReplacement(String s, int k) {
        int l = 0, r = 0, n = s.length();
        int[] cnt = new int[26];
        int maxn = 0;
        while(r < n) {
            int index = s.charAt(r)-'A';
            cnt[index]++;
            if(cnt[index] > maxn) {
                maxn = cnt[index];
            }
            if(r-l+1-maxn > k) {
                cnt[s.charAt(l)-'A']--;
                l++;
            }
            r++;
        }
        return r-l;
    }
}
