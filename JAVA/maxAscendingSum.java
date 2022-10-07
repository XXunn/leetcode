package leetcode;

/**
 * @author szx
 * @version 1.0
 * @description: TODO
 * @date 2022/10/7 20:37
 **/
public class maxAscendingSum {

    public int maxAscendingSum(int[] nums) {
        int len = nums.length;
        int maxSum = 0, curSum = nums[0];
        for(int i = 1; i < len; i++) {
            if(nums[i] > nums[i-1]) {
                curSum += nums[i];
            } else {
                maxSum = Math.max(maxSum, curSum);
                curSum = nums[i];
            }
        }
        maxSum = Math.max(maxSum, curSum);
        return maxSum;
    }

}
