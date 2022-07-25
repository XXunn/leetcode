package leetcode;

/**
 * @author szx
 * @version 1.0
 * @description: TODO
 * @date 2022/7/25 20:00
 **/
public class countAndSay {
    public String countAndSay(int n) {
        String s = "1";
        for(int i = 1; i < n ; i++) {
            s = desc(s);
        }
        return s;
    }

    private static String desc(String s) {
        if(s == null || s.length() == 0) {
            return "";
        }
        char[] chars = s.toCharArray();
        int len = s.length();
        int cnt = 1;
        StringBuilder sb = new StringBuilder();
        int i = 1;
        for(i = 1; i < len; i++) {
            if(chars[i] == chars[i-1]) {
                cnt++;
            } else {
                sb.append(cnt);
                sb.append(chars[i-1]);
                cnt = 1;
            }
        }
        sb.append(cnt);
        sb.append(chars[i-1]);
        return sb.toString();
    }

}
