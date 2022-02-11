package leetcode;

import java.util.Arrays;

public class minimumDifference {
    public int minimumDifference(int[] nums, int k) {
        int ans = 0x3f3f3f3f;
        Arrays.sort(nums);
        int n = nums.length;
        for(int i = 0; i < n; i++) {
            if(i+k-1<n && nums[i+k-1] - nums[i] < ans) {
                ans = nums[i+k-1] - nums[i];
            }
        }
        return ans;
    }
}
