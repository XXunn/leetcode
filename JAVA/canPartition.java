package leetcode;

import java.util.Arrays;

public class canPartition {

    public boolean canPartition(int[] nums) {
        int sum = 0, n = nums.length;
        for(int num : nums) {
            sum += num;
        }
        if(sum % 2 == 1) {
            return false;
        }
        sum >>= 1;
        boolean [][]dp = new boolean[n+1][sum+1];
        int i, j;
        for(i = 1; i <= n; i++) {
            for(j = 1; j <= sum; j++) {
                dp[i][j] = dp[i-1][j];
                if(j > nums[i-1]) {
                    dp[i][j] = (dp[i][j] || dp[i-1][j-nums[i-1]]);
                }
            }
        }
        return dp[n][sum];
    }

//    public boolean canPartition(int[] nums) {
//        int sum = 0, n = nums.length;
//        for(int num : nums) {
//            sum += num;
//        }
//        if(sum % 2 != 0) {
//            return false;
//        }
//        sum >>= 1;
//        int [][]dp = new int[n+1][sum+1];
//        int i, j;
//        for(i = 1; i <= n; i++) {
//            for(j = 1; j <= sum; j++) {
//                dp[i][j] = dp[i-1][j];
//                if(j >= nums[i-1]) {
//                    dp[i][j] = Math.max(dp[i][j], dp[i-1][j-nums[i-1]] + nums[i-1]);
//                }
//            }
//        }
//        return sum == dp[n][sum];
//    }
}
