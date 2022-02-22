package leetcode;

/**
 * @author szx
 * @version 1.0
 * @description: TODO
 * @date 2022/2/22 16:29
 **/
public class mySqrt {
    // sqrt(x) = x^0.5
    // = e^(0.5*ln(x))
    public int mySqrt(int x) {
        int ans = (int)Math.exp(0.5*Math.log(x));
        return (long) (ans+1)*(ans+1) <= x ? ans+1 : ans;
    }
}
