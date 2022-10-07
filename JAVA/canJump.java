package leetcode;

/**
 * @author szx
 * @version 1.0
 * @description: TODO
 * @date 2022/10/7 21:01
 **/
public class canJump {
    public boolean canJump(int[] nums) {
        if(null == nums || nums.length == 0) {
            return false;
        }
        int len = nums.length;
//        boolean[] dp = new boolean[len];
//        dp[0] = true;
//        for(int i = 0; i < len; i++) {
//            if(dp[i] == false) {
//                continue;
//            }
//            for(int j = 1; j <= nums[i] && i+j < len; j++) {
//                dp[i+j] = true;
//            }
//        }
//        return dp[len-1];
        int rightMost = 0;
        for(int i = 0; i < len-1; i++) {
            rightMost = Math.max(i + nums[i], rightMost);
            if(rightMost <= i) {
                return false;
            }
        }
        return true;
    }
}
