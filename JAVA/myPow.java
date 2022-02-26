package leetcode;

/**
 * @author szx
 * @version 1.0
 * @description: TODO
 * @date 2022/2/26 12:36
 **/
public class myPow {
    public double myPow(double x, int n) {
        // 注意这里n要转long, 因为n范围是 -2^31 <= n <= 2^31 -1
        // 如果n是-2^31, 转正后会溢出
        long N = n;
        return n>0?quickPow(x, N):1.0/quickPow(x,-N);
    }
    private double quickPow(double x, long n) {
        double ans = 1, base = x;
        while(n > 0) {
            if((n&1)==1) {
                ans *= base;
            }
            base*=base;
            n>>=1;
        }
        return ans;
    }
}
