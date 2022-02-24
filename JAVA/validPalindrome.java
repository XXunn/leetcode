package leetcode;

/**
 * @author szx
 * @version 1.0
 * @description: TODO
 * @date 2022/2/24 22:18
 **/
public class validPalindrome {
    public boolean validPalindrome(String s) {
        int l = 0, r = s.length()-1;
        while(l < r) {
            if(s.charAt(l) == s.charAt(r)) {
                l++;
                r--;
            } else {
                return judge(s, l, r-1) || judge(s, l+1, r);
            }
        }
        return true;
    }
    private boolean judge(String s, int start, int end) {
        while(start < end && s.charAt(start) == s.charAt(end)) {
            start++;
            end--;
        }
        return start >= end;
    }
}
