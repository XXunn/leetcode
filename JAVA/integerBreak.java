package leetcode;

/**
 * @author szx
 * @version 1.0
 * @description: TODO
 * @date 2022/2/26 11:58
 **/
public class integerBreak {
    public int integerBreak(int n) {
        if(n < 4) {
            return n-1;
        }
        int a = n/3, b = n%3;
        if(b == 0) {
            return (int)Math.pow(3, a);
        } else if(b == 2) {
            return (int)Math.pow(3,a)*2;
        }
        return (int)Math.pow(3, a-1)*4;
    }
}
