package leetcode;

/**
 * @author szx
 * @version 1.0
 * @description: TODO
 * @date 2022/3/5 8:50
 **/
public class findLUSlength {
    public int findLUSlength(String a, String b) {
        int lena = a.length(), lenb = b.length();
        int maxn = Math.max(lena, lenb);
        return a.equals(b) ? -1 : maxn;
    }
}
