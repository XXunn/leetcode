package leetcode;

/**
 * @author szx
 * @version 1.0
 * @description: TODO
 * @date 2022/7/25 19:44
 **/
public class myAtoi {
    public int myAtoi(String s) {
        if(s == null || s.length() == 0) {
            return 0;
        }
        int len = s.length();
        char[] chars = s.toCharArray();
        int index = 0;
        while(index < len && chars[index] == ' ') {
            index++;
        }
        if(index == len) {
            return 0;
        }
        int sign = 1;
        if(chars[index] == '-') {
            sign = -1;
            index++;
        } else if(chars[index] == '+') {
            index++;
        }
        int res = 0, last = 0;
        while(index < len) {
            char c = chars[index];
            index++;
            if(c < '0' || c > '9') {
                break;
            }
            int temp = c - '0';
            last = res;
            res = res*10 + temp;
            if(last != res/10) {
                return (sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE );
            }
        }
        return res*sign;
    }
}
