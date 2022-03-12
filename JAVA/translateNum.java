package leetcode;

/**
 * @author szx
 * @version 1.0
 * @description: TODO
 * @date 2022/3/12 9:46
 **/
public class translateNum {
    public static int translateNum(int num) {
        String str = String.valueOf(num);
        int[] dp = new int[str.length()+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 1; i < str.length(); i++) {
            if(str.charAt(i-1)=='1' || str.charAt(i-1)=='2'&& str.charAt(i)<='5') {
                dp[i+1] = dp[i-1]+dp[i];
            } else {
                dp[i+1] = dp[i];
            }
        }
        // for(int i = 0; i <= str.length(); i++) {
        //     System.out.print(dp[i] + " ");
        // }
        // System.out.println();
        return dp[str.length()];
    }

    public static void main(String[] args) {
        System.out.println(translateNum(12258));
    }
}
