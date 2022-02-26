package leetcode;

/**
 * @author szx
 * @version 1.0
 * @description: TODO
 * @date 2022/2/26 10:19
 **/
public class maximumDifference {
    public int maximumDifference(int[] nums) {
        int ans = -1, n = nums.length;
        if(n <= 1) {
            return -1;
        }
        for(int i = 1, minn = nums[0]; i < n; i++) {
            if(nums[i] > minn) {
                ans = Math.max(ans, nums[i]-minn);
            } else {
                minn = nums[i];
            }
        }
        return ans;
    }
}
