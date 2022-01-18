package leetcode;

public class longestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String ans = "";
        int n = strs.length;
        int i, j;
        if(n <= 1) {
            ans += strs[0];
            return ans;
        }
        int l = strs[0].length();
        for(i = 0; i < l; i++) {
            char x = strs[0].charAt(i);
            for(j = 1; j < n; j++) {
                if(i <= strs[j].length() - 1 && strs[j].charAt(i) == x) {
                    continue;
                } else {
                    return ans;
                }
            }
            ans += x;
        }
        return ans;
    }
}
