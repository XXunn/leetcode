package leetcode;

public class fib {
    static final int MOD = 1000000007;
    public int fib(int n) {
        int a = 0, b = 1, temp = 1;
        while(--n >= 0) {
            temp = (a+b) % MOD;
            a = b;
            b = temp;
        }
        return a;
    }
}
