package leetcode;

/**
 * @author szx
 * @version 1.0
 * @description: TODO
 * @date 2022/2/23 10:15
 **/
public class reverseOnlyLetters {

    public String reverseOnlyLetters(String s) {
        char[] chars = s.toCharArray();
        int n = chars.length;
        for(int l = 0, r = n-1; l < r; ) {
            while(l < r && !isAlf(chars[l])) {
                l++;
            }
            while(l < r && !isAlf(chars[r])) {
                r--;
            }
            if(l < r) {
                char temp = chars[l];
                chars[l] = chars[r];
                chars[r] = temp;
                l++;
                r--;
            }
        }
        return new String(chars);
    }

    /**
     * 判断传入char是否是字母
     * @param x
     * @return
     */
    private boolean isAlf(char x) {
        return (x >= 'a' && x <= 'z') || (x >= 'A' && x <= 'Z');
    }

    // public String reverseOnlyLetters(String s) {
    //     char[] chars = s.toCharArray();
    //     int n = s.length();
    //     for(int i = n-1, j = 0; i >= 0; i--) {
    //         while(j<n && !isAlf(chars[j])) {
    //             j++;
    //         }
    //         if(j < n && isAlf(s.charAt(i))) {
    //             // System.out.println(j + " " + s.charAt(i));
    //             chars[j] = s.charAt(i);
    //             j++;
    //             // System.out.println(chars);
    //         }
    //     }
    //     return new String(chars);
    // }
    // private boolean isAlf(char x) {
    //     return (x >= 'a' && x <= 'z') || (x >= 'A' && x <= 'Z');
    // }
}
