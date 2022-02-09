package leetcode;

public class countKDifference {
    public int countKDifference(int[] nums, int k) {
        int ans = 0;
        int[] record = new int[101];
        for(int num : nums) {
            if(num-k > 0) {
                ans += record[num-k];
            }
            if(num+k <= 100) {
                ans += record[num+k];
            }
            record[num]++;
        }
        return ans;
    }
    // public int countKDifference(int[] nums, int k) {
    //     int ans = 0;
    //     int l = nums.length;
    //     int i, j;
    //     for(i = 0; i < l; i++) {
    //         for(j = i + 1; j < l; j++) {
    //             if(Math.abs(nums[i] - nums[j]) == k) {
    //                 ans++;
    //             }
    //         }
    //     }
    //     return ans;
    // }
}
