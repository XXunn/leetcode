package leetcode;

public class removePalindromeSub {
    public int removePalindromeSub(String s) {
        // 注意，是回文子序列而不是回文序列： 这意味着你可以一次就串里的 a 全部删除掉
        int n = s.length();
        for(int i = 0; i < n/2; i++) {
            if(s.charAt(i) != s.charAt(n-1-i)) {
                return 2;
            }
        }
        return 1;
    }
}
