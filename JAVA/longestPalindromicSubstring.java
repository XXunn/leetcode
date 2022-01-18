package leetcode;

public class longestPalindromicSubstring {
    public static String longestPalindrome_DP(String s) {
        int len = s.length();
        if(len < 2) {
            return s;
        }
        int maxLen = 1;
        int st = 0;
        boolean [][]dp = new boolean[len][len];
        for(int i = 0; i < len; i++) {
            dp[i][i] = true;
        }
        char []arr = s.toCharArray();
        for(int l = 2; l <= len; l++) {
            for(int i = 0; i < len; i++) {
                int j = i + l -1;
                if(j >= len) {
                    break;
                }
                if(arr[i] != arr[j]) {
                    dp[i][j] = false;
                } else {
                    if(l <= 2) {
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = dp[i+1][j-1];
                    }
                }
                if(dp[i][j] && l > maxLen) {
                    maxLen = l;
                    st = i;
                }
            }
        }
        return s.substring(st, maxLen);
    }

    public String longestPalindrome_Center(String s) {
        int n = s.length();
        if(s.length() < 2) {
            return s;
        }
        int st = 0, end = 0;
        for(int i = 0; i < n; i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i+1);
            int len = Math.max(len1, len2);
            if(len > end - st + 1) {
                st = i - (len-1)/2;
                end = i + len/2;
            }
        }
        return s.substring(st, end);
    }
    public int expandAroundCenter(String s, int l, int r) {
        int n = s.length();
        while(l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
            l--;r++;
        }
        return r-l-1;
    }

    public static void main(String[] args) {
        String s = "babad";
    }
}
