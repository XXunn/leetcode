package leetcode;

public class totalMoney {
    public int totalMoney(int n) {
        int a = n/7;
        int b = n%7;
        int ans = 28*a + 7*(a-1)*a/2;
        ans += ((a+1) + (a+b)) * b /2;
        return ans;
    }
}
