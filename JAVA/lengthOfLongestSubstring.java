package leetcode;


import java.util.HashSet;
import java.util.Set;

public class lengthOfLongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        // "abcabcbb"
        Set<Character> st = new HashSet<Character>();
        int maxSize = 0;
        int l = 0, r = 0, n = s.length();
        // 特判 0 的情况
        if(n == 0) {
            return 0;
        }
        // 随着 L 的增大，对应的以 L 为头的不重复字串的右边界也会右移，所以直接开搞就 可以了
        // i == 0 特判
        st.add(s.charAt(0));
        while(r + 1 < n && !st.contains(s.charAt(r+1))) {
            st.add(s.charAt(r+1));
            r++;
        }
        maxSize = r-l+1;
        for(int i = 1; i < n; i++) {
            st.remove(s.charAt(l));
            l++;
            while(r + 1 < n && !st.contains(s.charAt(r+1))) {
                st.add(s.charAt(r+1));
                r++;
            }
            maxSize = Math.max(maxSize,r-l+1);
        }
        return maxSize;
    }

    public static int solution2(String s) {
        int n = s.length();
        int []next = new int[128];
        int maxn = 0;
        for(int l = 0, r = 0; r < n; r++) {
            // 如果有重复的话 next[s.charAt(r)] > l, 此时才会跳
            l = Math.max(l, next[s.charAt(r)]);
            next[s.charAt(r)] = r+1;
            maxn = Math.max(maxn, r-l+1);
        }
        return maxn;
    }

    public static void main(String[] args) {
        try {
            Thread.sleep(1000*50L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }

}
