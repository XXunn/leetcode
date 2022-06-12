package leetcode;

/**
 * @author szx
 * @version 1.0
 * @description: TODO
 * @date 2022/6/12 20:22
 **/
public class minFlipsMonoIncr {
    /**
     * 简单dp， 已AC， 但是效率底下， 可以优化？
    public int minFlipsMonoIncr(String s) {
        if(s.isEmpty()) {
            return 0;
        }
        int len = s.length();
        // dp[i][0]: 第i位为0最小花费 ---> 只能由前i-1位为0转换而来
        // dp[i][1]: 第i位为1最小花费 ---> 可以有前i-1位置为0或者为1转化而来
        int [][]dp = new int[len][2];
        if(s.charAt(0) == '0') {
            dp[0][1] = 1;
        } else {
            dp[0][0] = 1;
        }
        for(int i = 1; i < len; i++) {
            if(s.charAt(i) == '0') {
                dp[i][0] = dp[i-1][0];
                dp[i][1] = dp[i-1][1] + 1;
            } else {
                dp[i][0] = dp[i-1][0] + 1;
                dp[i][1] = Math.min(dp[i-1][1], dp[i-1][0]);
            }
        }
        return Math.min(dp[len-1][0], dp[len-1][1]);
    }
    **/

    /**
     *  对上面的进行了优化，只使用了两个变量，保存最终状态
     *
    public int minFlipsMonoIncr(String s) {
        if(s.isEmpty()) {
            return 0;
        }
        int dp0 = 0, dp1 = 0;
        if(s.charAt(0) == '0') {
            dp1 = 1;
        } else {
            dp0 = 1;
        }
        // System.out.println(dp0 + " " + dp1);
        for(int i = 1; i < s.length(); i++) {
            if(s.charAt(i) == '0') {
                dp1++;
            } else {
                dp1 = Math.min(dp1, dp0);
                dp0++;
            }
            // System.out.println(dp0 + " " + dp1);
        }
        return Math.min(dp0, dp1);
    }
     */

    // 记录当前位置前面有多少个1,后面多少个0, 以当前位置为基准变化, 看需要改动多少字符
    public int minFlipsMonoIncr(String s) {
        if(s.isEmpty()) {
            return 0;
        }
        // 前面多少个 1
        int []x = new int[s.length()];
        // 后面多少个 0
        int []y = new int[s.length()];
        for(int i = 1; i < s.length(); i++) {
            // if(s.charAt(i-1) == '1') {
            //     x[i] = x[i-1] + 1;
            // }
            x[i] = (s.charAt(i-1) == '1' ? x[i-1]+1 : x[i-1]);
            // if(s.charAt(s.length() - i) == '0') {
            //     y[s.length()-i-1] = y[s.length()-i]+1;
            // }
            y[s.length() - i - 1] = (s.charAt(s.length()-i) == '0' ? y[s.length()-i]+1 : y[s.length()-i]);
        }
        int ans = 0x3f3f3f;
        for(int i = 0; i < s.length(); i++) {
            System.out.println(x[i] + " " + y[i]);
            ans = Math.min(ans, x[i]+y[i]);
        }
        return ans;
    }
}
