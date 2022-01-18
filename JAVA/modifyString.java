package leetcode;

public class modifyString {
    public String modifyString(String s) {
        int n = s.length();
        char[] c = s.toCharArray();
        for(int i = 0; i < n; i++) {
            if(c[i] == '?') {
                for(char x = 'a'; x <= 'z'; x++) {
                    if((i > 0 && c[i-1] == x) || (i < n-1 && c[i+1] == x)) {
                        continue;
                    }
                    c[i] = x;
                }
            }
        }
        return c.toString();
    }
}
