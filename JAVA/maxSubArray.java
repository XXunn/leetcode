package leetcode;

/**
 * @author szx
 * @version 1.0
 * @description: TODO
 * @date 2022/3/1 22:17
 **/
public class maxSubArray {
    public int maxSubArray(int[] nums) {
        int curSum = 0, ans = -100000;
        for(int num : nums) {
            curSum += num;
            ans = Math.max(ans, curSum);
            if(curSum < 0) {
                curSum = 0;
            }
        }
        return ans;
    }
}
