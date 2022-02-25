package leetcode;

/**
 * @author szx
 * @version 1.0
 * @description: TODO
 * @date 2022/2/25 14:16
 **/
public class replaceSpace {
    public String replaceSpace(String s) {
        int n = s.length();
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < n; i++) {
            if(s.charAt(i) != ' ') {
                stringBuilder.append(s.charAt(i));
            } else {
                stringBuilder.append("%20");
            }
        }
        return stringBuilder.toString();
        // return s.replaceAll(" ", "%20");
    }
}
